## About
Example of Maven multi module project with generic endpoints.
It is divided on three modules:
- common
- web-one
- web-two

Common module contains generic endpoints and service.
Web modules contains service implementation and specific DTO.

## Usage

To build project run 
```
./mvnw clean install -P web-one
```
or 
```
./mvnw clean install -P web-two
```

Executable .jar file will be located in `target` 
folder in root project.

After running .jar file you can curl for both services
```
curl http://localhost:8080
```

```
curl http://localhost:8080/message
```

and in case of running web-one
```
curl -v -X POST -H 'Content-type: application/json' http://localhost:8080 -d '{"node" : {"webOneMessage" : "message"}}'
```

and web-two
```
curl -v -X POST -H 'Content-type: application/json' http://localhost:8080 -d '{"node" : {"webTwoMessage" : "message"}}'
```
