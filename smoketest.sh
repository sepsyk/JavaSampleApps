#/!bin/bash

response=$(curl -s -o /dev/null -X POST -d '{"message": "something"}' http://127.0.0.1:8081/reverse -w "%{http_code}")
echo $response

