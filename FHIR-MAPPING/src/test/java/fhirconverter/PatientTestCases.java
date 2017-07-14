package fhirconverter;
import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.*; 
import org.json.JSONException; 
import org.json.JSONObject;
import org.json.JSONArray;
public class PatientTestCases{
	/*
	 * Change to diff to compare results
	@Test
	public void testPatientWorkFlow(){
		PatientFHIR tester = new PatientFHIR();
		String data = tester.convertFHIR();
		JSONObject jsonObj = new JSONObject(data);
		String expected = "{resourceType:\"Patient\",identifier:[{system:\"http://ns.electronichealth.net.au/id/hi/ihi/1.0\",value: 8003608166690503}], name:[{use: \"official\", given:[\"Sam\"], prefix:[ \"Mr\"]}]}";
		Assert.assertTrue(jsonObj.has("resourceType"));		
	}

	@Test
	public void testPatientSearch() throws Exception {
		PatientFHIR tester = new PatientFHIR();
		JSONObject patientSearch = new JSONObject();
		patientSearch.put("familyName", new String("ppp"));
      		patientSearch.put("givenName", new String("eee"));
	        JSONObject reply = new JSONObject();
  	       	reply = tester.search(patientSearch);
		Assert.assertTrue(reply.has("entry"));
		JSONObject resource = reply.optJSONObject("entry");
		Assert.assertTrue(resource.has("resource"));
		JSONArray patient = resource.optJSONArray("resource");	
		Assert.assertFalse(patient.equals(null));
		JSONObject patientDetails = patient.getJSONObject(0);
		Assert.assertTrue(patientDetails.has("resourceType"));
		String resourceType = patientDetails.optString("resourceType");
		Assert.assertEquals(resourceType, "Patient");
	}
	@Test
	public void testPatientRead() {
		PatientFHIR tester = new PatientFHIR();
		JSONObject reply = new JSONObject();
		String testerString = "2";
  	        try {
 	       		reply = tester.read(testerString);
			Assert.assertTrue(reply.has("entry"));
			JSONObject resource = reply.optJSONObject("entry");
			Assert.assertTrue(resource.has("resource"));
			JSONArray patient = resource.optJSONArray("resource");	
			Assert.assertFalse(patient.equals(null));
			JSONObject patientDetails = patient.getJSONObject(1);
			Assert.assertTrue(patientDetails.has("resourceType"));
			String resourceType = patientDetails.optString("resourceType");
			Assert.assertEquals(resourceType, "Patient");	
		} catch (Exception e) {
    			e.printStackTrace();
		}
         			
	}
	*/
	@Test
	public void testPatientUpdate() {
		
	}
	@Test
	public void testPatientPatch() {
		
	}
	@Test
	public void testPatientCreate() throws Exception {
		PatientFHIR tester = new PatientFHIR();
		final String jsonCreate = "{\"identifier\":[{\"system\":\"IHELOCAL\",\"value\":\"54645987312\"},{\"system\":\"2.16.840.1.113883.4.357\",\"value\":\"74fc9df0-66f6-11e7-b2e0-0242ac120003\"}],\"address\":[{\"country\":\"UK\",\"city\":\"erwtfg\",\"line\":[\"ffggfr\",\"retwert\"],\"postalCode\":\"65498\",\"text\":\"ffggfr retwert erwtfg dfghtry 65498 UK\",\"state\":\"dfghtry\"}],\"gender\":\"male\",\"meta\":{\"lastUpdated\":\"2017-07-12T00:00:00.000+00:00\"},\"multipleBirthInteger\":2,\"name\":[{\"given\":[\"eee\",\"adsfasd\"],\"prefix\":[\"Mr\"],\"family\":\"ppp\",\"suffix\":[\"Dr\"]}],\"telecom\":[{\"system\":\"email\",\"value\":\"dfgdfg@gmail.com\"},{\"system\":\"phone\",\"value\":\"044225216748963\"}],\"id\":\"1\",\"birthDate\":\"2017-07-11\",\"maritalStatus\":{\"text\":\"sfgrgrr\"},\"resourceType\":\"Patient\"}";
		final String jsonCreate2 = "{\n" +
            "  \"resourceType\": \"Patient\",\n" +
            "  \"id\": \"170445\",\n" +
            "  \"meta\": {\n" +
            "    \"versionId\": \"1\",\n" +
            "    \"lastUpdated\": \"2017-07-06T13:12:42.328-04:00\",\n" +
            "    \"profile\": [\n" +
            "      \"http://standardhealthrecord.org/fhir/StructureDefinition/shr-demographics-PersonOfRecord\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"text\": {\n" +
            "    \"status\": \"generated\",\n" +
            "    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\">Generated by <a href=\\\"https://github.com/synthetichealth/synthea\\\">Synthea</a>. Version identifier: b38b8877256db0b7ec1ede270729a1c940ad8b33</div>\"\n" +
            "  },\n" +
            "  \"extension\": [\n" +
            "    {\n" +
            "      \"url\": \"http://hl7.org/fhir/us/core/StructureDefinition/us-core-race\",\n" +
            "      \"valueCodeableConcept\": {\n" +
            "        \"coding\": [\n" +
            "          {\n" +
            "            \"system\": \"http://hl7.org/fhir/v3/Race\",\n" +
            "            \"code\": \"2106-3\",\n" +
            "            \"display\": \"White\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"text\": \"race\"\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"url\": \"http://hl7.org/fhir/us/core/StructureDefinition/us-core-ethnicity\",\n" +
            "      \"valueCodeableConcept\": {\n" +
            "        \"coding\": [\n" +
            "          {\n" +
            "            \"system\": \"http://hl7.org/fhir/v3/Ethnicity\",\n" +
            "            \"code\": \"2186-5\",\n" +
            "            \"display\": \"Nonhispanic\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"text\": \"ethnicity\"\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"url\": \"http://hl7.org/fhir/StructureDefinition/birthPlace\",\n" +
            "      \"valueAddress\": {\n" +
            "        \"city\": \"Fitchburg\",\n" +
            "        \"state\": \"MA\",\n" +
            "        \"country\": \"US\"\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"url\": \"http://hl7.org/fhir/StructureDefinition/patient-mothersMaidenName\",\n" +
            "      \"valueString\": \"Juliet345 Pollich990\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"url\": \"http://hl7.org/fhir/us/core/StructureDefinition/us-core-birthsex\",\n" +
            "      \"valueCode\": \"F\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"url\": \"http://hl7.org/fhir/StructureDefinition/patient-interpreterRequired\",\n" +
            "      \"valueBoolean\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"url\": \"http://standardhealthrecord.org/fhir/StructureDefinition/shr-actor-FictionalPerson-extension\",\n" +
            "      \"valueBoolean\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"url\": \"http://standardhealthrecord.org/fhir/StructureDefinition/shr-demographics-FathersName-extension\",\n" +
            "      \"valueHumanName\": {\n" +
            "        \"text\": \"Dane156 Stroman117\"\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"url\": \"http://standardhealthrecord.org/fhir/StructureDefinition/shr-demographics-SocialSecurityNumber-extension\",\n" +
            "      \"valueString\": \"999-27-8612\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"identifier\": [\n" +
            "    {\n" +
            "      \"system\": \"https://github.com/synthetichealth/synthea\",\n" +
            "      \"value\": \"1b837734-5083-4590-b588-4c7732e5ac8f\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"type\": {\n" +
            "        \"coding\": [\n" +
            "          {\n" +
            "            \"system\": \"http://hl7.org/fhir/identifier-type\",\n" +
            "            \"code\": \"SB\"\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      \"system\": \"http://hl7.org/fhir/sid/us-ssn\",\n" +
            "      \"value\": \"999278612\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"type\": {\n" +
            "        \"coding\": [\n" +
            "          {\n" +
            "            \"system\": \"http://hl7.org/fhir/v2/0203\",\n" +
            "            \"code\": \"DL\"\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      \"system\": \"urn:oid:2.16.840.1.113883.4.3.25\",\n" +
            "      \"value\": \"S99969306\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"type\": {\n" +
            "        \"coding\": [\n" +
            "          {\n" +
            "            \"system\": \"http://hl7.org/fhir/v2/0203\",\n" +
            "            \"code\": \"PPN\"\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      \"system\": \"http://standardhealthrecord.org/fhir/StructureDefinition/passportNumber\",\n" +
            "      \"value\": \"X77003736X\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"type\": {\n" +
            "        \"coding\": [\n" +
            "          {\n" +
            "            \"system\": \"http://hl7.org/fhir/v2/0203\",\n" +
            "            \"code\": \"MR\"\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      \"system\": \"http://hospital.smarthealthit.org\",\n" +
            "      \"value\": \"1b837734-5083-4590-b588-4c7732e5ac8f\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"name\": [\n" +
            "    {\n" +
            "      \"use\": \"official\",\n" +
            "      \"family\": \"Hansen448\",\n" +
            "      \"given\": [\n" +
            "        \"Elissa46\"\n" +
            "      ],\n" +
            "      \"prefix\": [\n" +
            "        \"Mrs.\"\n" +
            "      ]\n" +
            "    },\n" +
            "    {\n" +
            "      \"use\": \"maiden\",\n" +
            "      \"family\": \"Stroman117\",\n" +
            "      \"given\": [\n" +
            "        \"Elissa46\"\n" +
            "      ]\n" +
            "    }\n" +
            "  ],\n" +
            "  \"telecom\": [\n" +
            "    {\n" +
            "      \"system\": \"phone\",\n" +
            "      \"value\": \"(448) 739-2195\",\n" +
            "      \"use\": \"home\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"gender\": \"female\",\n" +
            "  \"birthDate\": \"1956-04-22\",\n" +
            "  \"deceasedDateTime\": \"2015-01-04T07:06:43-05:00\",\n" +
            "  \"address\": [\n" +
            "    {\n" +
            "      \"extension\": [\n" +
            "        {\n" +
            "          \"url\": \"http://hl7.org/fhir/StructureDefinition/geolocation\",\n" +
            "          \"extension\": [\n" +
            "            {\n" +
            "              \"url\": \"latitude\",\n" +
            "              \"valueDecimal\": 42.610683558943805\n" +
            "            },\n" +
            "            {\n" +
            "              \"url\": \"longitude\",\n" +
            "              \"valueDecimal\": -71.07136500645896\n" +
            "            }\n" +
            "          ]\n" +
            "        }\n" +
            "      ],\n" +
            "      \"line\": [\n" +
            "        \"3992 Metz Mountains\"\n" +
            "      ],\n" +
            "      \"city\": \"North Andover\",\n" +
            "      \"state\": \"MA\",\n" +
            "      \"postalCode\": \"01845\",\n" +
            "      \"country\": \"US\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"maritalStatus\": {\n" +
            "    \"coding\": [\n" +
            "      {\n" +
            "        \"system\": \"http://hl7.org/fhir/v3/MaritalStatus\",\n" +
            "        \"code\": \"M\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"text\": \"M\"\n" +
            "  },\n" +
            "  \"multipleBirthBoolean\": false,\n" +
            "  \"communication\": [\n" +
            "    {\n" +
            "      \"language\": {\n" +
            "        \"coding\": [\n" +
            "          {\n" +
            "            \"system\": \"http://hl7.org/fhir/ValueSet/languages\",\n" +
            "            \"code\": \"en-US\",\n" +
            "            \"display\": \"English (United States)\"\n" +
            "          }\n" +
            "        ]\n" +
            "      }\n" +
            "    }\n" +
            "  ],\n" +
            "  \"generalPractitioner\": [\n" +
            "    {\n" +
            "      \"reference\": \"Organization/170444\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";
		JSONObject create = new JSONObject(jsonCreate);
		JSONObject create1 = new JSONObject(jsonCreate2);
		//JSONObject reply = tester.create(create);  Lets do some mock up. Dont add straight to database :d by koon
		//JSONObject reply2 = tester.create(create1);
		//System.out.println(reply.toString());
		//need to add diff code to compare 
	}
	@Test
	public void testPatientDelete() {
	}
}
