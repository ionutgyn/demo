## Contents
- [Requirements](#requirements)
- [Build & Run](#build-&-run)
  - [Standalone](#standalone)
  - [Docker](#docker)
  
### Requirements
+ Maven 3.x
+ Java >= 8
+ (Optional) Docker

### Build & Run
#### Standalone
+ Run `mvn clean package`
+ Exec `mvn spring-boot:run` or `java -jar target/demo.jar`
+ Access http://localhost:8080 

#### Docker
+ Run `mvn clean package`
+ Exec `docker build -t demo:1 .` & `docker tag demo:1 demo:latest`
+ Exec `docker run -p 8080:8080 demo:latest` or `docker-compose up`
+ Access http://localhost:8080

