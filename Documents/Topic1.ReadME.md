# Topic 1 – Minimal Spring Boot REST API & Application Structure

## 1. What Are We Learning?

- How to build a minimal Spring Boot REST API.
- Understanding the main building blocks:
    - `@SpringBootApplication`
    - `@RestController`
    - `@Service`
    - Basic Dependency Injection (DI).

## 2. Why Are We Learning It?

- Spring Boot removes boilerplate setup for web servers and routing.
- Lets us focus on business logic instead of infrastructure.
- This structure is the foundation of real-world Spring Boot applications and microservices.

## 3. Where Is It Used?

- Backends for web and mobile apps (REST APIs).
- Microservices exposing endpoints like `/api/users`.
- Internal tools and admin APIs.

## 4. How to Run the Example

1. Ensure Java 17+ and Maven are installed.
2. Project structure (Maven):

   ```text
   spring-boot-basics/
   ├─ pom.xml
   └─ src/
      └─ main/
         └─ java/
            └─ com/
               └─ example/
                  └─ springbootbasics/
                     ├─ SpringBootBasicsApplication.java
                     ├─ controller/
                     │  └─ GreetingController.java
                     └─ service/
                        └─ GreetingService.java