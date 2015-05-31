curl --include http://localhost:9000/place/list

/* Response:

HTTP/1.1 200 OK
Content-Type: application/json; charset=utf-8
Content-Length: 141


[{"name":"Sandleford","location":{"lat":51.377797,"long":-1.318965}},{"name":"Watership Down","location":{"lat":51.235685,"long":-1.309197}}]
 */

Testing the action with a valid data:

curl --include --request POST --header "Content-type: application/json" --data '{"name":"Nuthanger Farm","location":{"lat" : 51.244031,"long" : -1.263224}}' http://localhost:9000/place
Response:

HTTP/1.1 200 OK
Content-Type: application/json; charset=utf-8
Content-Length: 57

{"status":"OK","message":"Place 'Nuthanger Farm' saved."}
Testing the action with a invalid data, missing “name” field:

curl --include --request POST --header "Content-type: application/json" --data '{"location":{"lat" : 51.244031,"long" : -1.263224}}' http://localhost:9000/place

Response:

HTTP/1.1 400 Bad Request
Content-Type: application/json; charset=utf-8
Content-Length: 79

{"status":"KO","message":{"obj.name":[{"msg":"error.path.missing","args":[]}]}}
Te
sting the action with a invalid data, wrong data type for “lat”:

curl --include --request POST --header "Content-type: application/json" --data '{"name":"Nuthanger Farm","location":{"lat" : "xxx","long" : -1.263224}}' http://localhost:9000/place

Response:

HTTP/1.1 400 Bad Request
Content-Type: application/json; charset=utf-8
Content-Length: 92

{"status":"KO","message":{"obj.location.lat":[{"msg":"error.expected.jsnumber