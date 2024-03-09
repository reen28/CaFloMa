package de.rs.cafloma.app.api.core.ext.validation

import de.rs.cafloma.app.api.core.ext.response.ResponseHttpStatusCodeProvider
import org.springframework.http.HttpStatus

data class ValidationResponse(val constraintViolations: Set<String?>): ResponseHttpStatusCodeProvider {
    override fun status(): HttpStatus = HttpStatus.BAD_REQUEST
}
