package de.rs.cafloma.app.api.core.ext.validation

import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.util.stream.Collectors

@RestControllerAdvice
class ConstraintViolationResponseHandler {

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleConstraintViolation(methodArgumentNotValidException: MethodArgumentNotValidException): ValidationResponse {
        val constraintViolationKeys = methodArgumentNotValidException.fieldErrors
            .stream()
            .filter { it.defaultMessage != null }
            .map {it.defaultMessage}
            .collect(Collectors.toSet())
        return ValidationResponse(constraintViolationKeys)
    }

}