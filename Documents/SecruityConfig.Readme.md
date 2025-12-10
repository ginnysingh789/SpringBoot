# Topic 9 – Basic Spring Security (Protect One Endpoint)

## Goal
## No one can access url without credintial if they try to skip login and access their http request get rejected 


- Add Spring Security to a Spring Boot app.
- Have:
    - `/public` – no login required.
    - `/secret` – login required.

## Dependencies

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-security</artifactId>
</dependency>