package de.rs.cafloma.app.api.core.response

import org.springframework.http.HttpStatus

interface ResponseHttpStatusCodeProvider {
    fun status(): HttpStatus
}