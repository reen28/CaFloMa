## How does *CaFloMa* validation flow look like?

For validation *CaFloMa* is using the `jakarta` annotations at `*Context` class level. The trigger is the `@Valid` 
annotation at controller level.

### Example of a context class being validated

```kotlin
data class CreateTransactionContext(@field:NotBlank(message = CREATE_TRANSACTION_TITLE_REQUIRED)
                                    @field:Min(message = CREATE_TRANSACTION_TITLE_BELOW_MIN_LENGTH, value = 3)
                                    @field:Max(message = CREATE_TRANSACTION_TITLE_ABOVE_MAX_LENGTH, value = 50)
                                    val title: String?
)
```
Note: When using data class make sure that on `NotNull` validation the context class supports null values.


### Case: All fields are valid

If all fields are valid the request is handled by the respective controller method.

### Case: One or more fields are invalid

If one of more fields are invalid the exception handler inside `ConstraintViolationResponseHandler` class is handling
the response mentioning each constraint violations the fields of the context are facing.

