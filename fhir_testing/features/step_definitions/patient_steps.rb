#encoding: utf-8

require 'rest-client'
require 'json'
require 'crack/xml'
require "rspec"
include RSpec::Matchers

def new_patient(family_name, given_name)
  patient = { resourceType: "Patient", name: [ {family: family_name, given: [given_name]} ] }
end

def new_patch(family_name, given_name)
  patch= [ {op: "add", path: "/given", value: given_name}]
end

#
# When
#

When(/^I create a patient with family name "([^"]*)" and given name "([^"]*)"$/) do |family_name, given_name|
  payload = new_patient(family_name, given_name).to_json
  @response = RestClient.post 'http://localhost:4567/fhir/Patient', payload, :content_type => 'application/json', :accept => :json
end

When(/^I search a patient with family name "([^"]*)" and given name "([^"]*)"$/) do |family_name, given_name|
  @response = RestClient.get "http://localhost:4567/fhir/Patient?family=#{family_name}&given=#{given_name}", :content_type => :json, :accept => :json
end

When(/^I read a patient with id (\d+)(?: and format ([a-zA-Z\/\+]+))?$/) do |id, _format|
  if _format.nil?
    url = "http://localhost:4567/fhir/Patient/#{id}"
  else
    url = "http://localhost:4567/fhir/Patient/#{id}?_format=#{_format}"
  end
  @response = RestClient.get url, :content_type => :json, :accept => :json
end

When(/^I update a patient with id (\d+) and family name "([^"]*)", given name "([^"]*)"$/) do |id, family_name, given_name|
  payload = new_patient(family_name, given_name).to_json
  @response = RestClient.put "http://localhost:4567/fhir/Patient/#{id}", payload, :content_type => :json, :accept => :json
end

When(/^I patch a patient with id (\d+) and family name "([^"]*)", given name "([^"]*)"$/) do |id, family_name, given_name|
  payload = new_patch(family_name, given_name).to_json
  @response = RestClient.patch "http://localhost:4567/fhir/Patient/#{id}", payload, :content_type => :json, :accept => :json
end

When(/^I delete a patient with id (\d+)$/) do |id|
  begin
    @response = RestClient.delete "http://localhost:4567/fhir/Patient/#{id}", :content_type => :json, :accept => :json
  rescue StandardError => e
    @response = e.response
  end
end

#
# Then
#

Then(/^the server has response with key "([^"]*)" and content "([^"]*)"$/) do |key, content|
  json_response = JSON.parse(@response.body)
  expect(json_response).to have_key(key)
  expect(json_response[key]).to match(content) do |id|
    puts id
  end
end

Then(/^the server response has json key "([^"]*)"$/) do |key|
  json_response = JSON.parse(@response.body)
  expect(json_response).to have_key(key)
end

Then(/^the server response has XML tag "([^"]*)"$/) do |content|
  xml_json = Crack::XML.parse(@response.body)
  expect(xml_json).to have_key(content)
end

And(/^has status code (\d+)$/) do |code|
  expect(@response.code).to eq(code.to_i)
end