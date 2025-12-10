# Topic 7 – Simple Global Exception Handling with @RestControllerAdvice

## Goal

- Handle errors in one place.
- Customize responses for:
    - Validation errors (`MethodArgumentNotValidException`)
    - `IllegalArgumentException`

## Files

- `src/main/java/com/example/exceptiondemo/ExceptionDemoApplication.java`
- `src/main/java/com/example/exceptiondemo/model/Message.java`
- `src/main/java/com/example/exceptiondemo/controller/MessageController.java`
- `src/main/java/com/example/exceptiondemo/exception/GlobalExceptionHandler.java`

## Endpoints

- `POST /validated-messages`
    - Uses `@Valid @RequestBody Message`.
    - Invalid -> handled by `handleValidationException`.

- `GET /cause-error?type=illegal`
    - Throws `IllegalArgumentException` -> handled by `handleIllegalArgument`.

## Flow

```text
Controller throws or triggers exception
    -> GlobalExceptionHandler (@RestControllerAdvice)
    -> @ExceptionHandler methods
    -> Set HTTP status + return error text