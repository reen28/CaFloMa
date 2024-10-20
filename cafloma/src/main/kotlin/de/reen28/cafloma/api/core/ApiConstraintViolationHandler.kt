package de.reen28.cafloma.api.core

import de.reen28.cafloma.core.result.Result
import de.reen28.cafloma.core.result.cases.ErrorResultCase
import de.reen28.cafloma.core.result.cases.HttpStatusCodeResultCase
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ApiConstraintViolationHandler {

    data class ConstraintViolationResultCase(val constraintViolations: List<String>): HttpStatusCodeResultCase, ErrorResultCase {
        override fun statusCode(): HttpStatusCode = HttpStatus.BAD_REQUEST
    }

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleConstraintViolation(e: MethodArgumentNotValidException): Result<ConstraintViolationResultCase> {
        val constraintViolations = e.fieldErrors
            .mapNotNull { it.defaultMessage }
        return Result.error(ConstraintViolationResultCase(constraintViolations))
    }

}