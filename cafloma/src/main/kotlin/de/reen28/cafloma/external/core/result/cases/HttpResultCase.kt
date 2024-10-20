package de.reen28.cafloma.external.core.result.cases

import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode

/**
 * Represents a result case that is associated with an HTTP status code.
 * Extends [ResultCase] and provides a method [statusCode] to return an [HttpStatusCode].
 * This interface can be extended to define specific cases with associated HTTP status codes.
 * @since 1.0
 */
interface HttpStatusCodeResultCase: ResultCase {

    /**
     * Returns the [HttpStatusCode] associated with this result case.
     * @return the HTTP status code of this result case.
     */
    fun statusCode(): HttpStatusCode

    /**
     * A sealed interface that defines simple HTTP status code cases.
     */
    sealed interface SimpleCase: HttpStatusCodeResultCase {

        /**
         * Represents a server error with the HTTP status code 500 (Internal Server Error).
         */
        data object ServerError: SimpleCase {
            override fun statusCode(): HttpStatusCode = HttpStatus.INTERNAL_SERVER_ERROR
        }

    }

}