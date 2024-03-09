package de.rs.cafloma.app.api.core.ext.response

import org.springframework.http.HttpStatus

interface ResponseHttpStatusCodeProvider {
    fun status(): HttpStatus
}