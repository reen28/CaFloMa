package de.rs.cafloma.app.api.transaction.ext.responses

import de.rs.cafloma.app.api.core.ext.response.ResponseHttpStatusCodeProvider
import org.springframework.http.HttpStatus


sealed class CreateTransactionResponse(): ResponseHttpStatusCodeProvider {
    data object Created : CreateTransactionResponse() {
        override fun status(): HttpStatus = HttpStatus.CREATED
    }
}