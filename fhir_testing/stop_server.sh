#!/bin/bash

kill -9 `cat .saved_pid 2>/dev/null` 2>/dev/null && rm .saved_pid -f 