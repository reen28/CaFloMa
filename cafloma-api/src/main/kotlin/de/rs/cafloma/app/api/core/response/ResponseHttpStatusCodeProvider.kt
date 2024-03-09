package de.rs.cafloma.app.api.core.response

import org.springframework.http.HttpStatusCode

interface ResponseHttpStatusCodeProvider {
    fun statusCode(): HttpStatusCode
}