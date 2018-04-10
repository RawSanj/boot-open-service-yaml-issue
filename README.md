# boot-open-service-yaml-issue
Spring Boot Open Service Broker application.YML Issue

## Run the application:

```sh
$ mvn spring-boot:run
$ // OR Build and run
$ mvn clean package -DskipTests=true && java -jar target/boot-open-service-yaml-issue-0.0.1-SNAPSHOT.jar
```

Spring Boot App exits without any proper error info.

## Update/Fix the `src/main/resources/application.yml` file and re-run the application.

Spring Boot App works just fine.

## Again introduce error in `src/main/resources/application.yml` file but update the `pom.xml` to Spring Boot 1.5.X Release and re-run the applciation.

Spring Boot App works just fine.
