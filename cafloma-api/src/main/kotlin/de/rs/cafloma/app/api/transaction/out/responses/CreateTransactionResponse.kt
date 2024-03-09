package de.rs.cafloma.app.api.transaction.out.responses

import de.rs.cafloma.app.api.core.response.ResponseHttpStatusCodeProvider
import org.springframework.http.HttpStatus


sealed class CreateTransactionResponse(): ResponseHttpStatusCodeProvider {
    data object Created : CreateTransactionResponse() {
        override fun statusCode(): HttpStatus = HttpStatus.CREATED
    }
}