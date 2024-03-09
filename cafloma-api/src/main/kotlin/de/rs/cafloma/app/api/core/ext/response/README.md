
## How does *CaFloMa* response flow look like?

### Sealed Response Classes

- Each API endpoint representing its response by a subclass of sealed class
- The sealed class has subclasses representing each possible status that a request to this endpoint might result in
- The subclass of the sealed class implements `ResponseHttpStatusCodeProvider` to provide the http status code to the
specific case

---

The example below shows the wrapper, the sealed class `CreateTransactionResponse` implementing the 
`ResponseHttpStatusCodeProvider` to ensure that each subclass is providing the http status code. 

```kotlin

sealed class CreateTransactionResponse(): ResponseHttpStatusCodeProvider {
    data object Created : CreateTransactionResponse() {
        override fun statusCode(): HttpStatus = HttpStatus.CREATED
    }
}

```

## How does *CaFloMa* map the http status code to http response?

The http status code is mapped via a registered `ResponseBodyAdvice` using the method `beforeBodyWrite`. 
The `ResponseBodyAdvice` supports every class that implements the interface `ResponseHttpStatusCodeProvider` in order 
to ensure the http status code is available.
