# Topic 2 – Dependency Injection, Beans & ApplicationContext

## 1. What Are We Learning?

- What a **Spring bean** is.
- What the **ApplicationContext** is (Spring's container).
- How **Dependency Injection (DI)** works in Spring using constructor injection.
- How multiple beans of the same interface are handled with `@Primary`.

## 2. Why Is This Important?

- In real Spring Boot apps, almost all classes are managed as beans.
- The ApplicationContext manages their lifecycle and relationships.
- DI removes manual `new` calls and wiring, making code:
    - Easier to change
    - Easier to test
    - Less tightly coupled

## 3. Project Structure

```text
spring-boot-di-basics/
├─ pom.xml
└─ src/
   └─ main/
      └─ java/
         └─ com/
            └─ example/
               └─ dibasics/
                  ├─ DiBasicsApplication.java
                  ├─ controller/
                  │  └─ NotificationController.java
                  ├─ service/
                  │  ├─ MessageService.java
                  │  ├─ EnglishMessageService.java
                  │  ├─ HindiMessageService.java
                  │  └─ NotificationService.java
                  └─ config/
                     └─ StartupRunner.java