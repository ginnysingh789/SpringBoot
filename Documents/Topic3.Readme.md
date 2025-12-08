# Topic 3 (Simple) – application.properties and @Value

## What is this?

- `application.properties` is a settings file.
- `@Value` lets us read a value from that file into a Java variable.

## Files

- `src/main/resources/application.properties`
- `src/main/java/com/example/demo/DemoApplication.java`
- `src/main/java/com/example/demo/controller/WelcomeController.java`

## Steps to Run

1. Put this in `application.properties`:

   ```properties
   server.port=8080
   app.welcome.message=Hello from application.properties!