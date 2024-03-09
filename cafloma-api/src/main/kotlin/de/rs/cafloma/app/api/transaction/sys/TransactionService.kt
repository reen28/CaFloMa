package de.rs.cafloma.app.api.transaction.sys

import de.rs.cafloma.app.api.transaction.out.contexts.CreateTransactionContext
import de.rs.cafloma.app.api.transaction.out.responses.CreateTransactionResponse
import org.springframework.stereotype.Service

@Service
class TransactionService {

    fun createTransaction(createTransactionContext: CreateTransactionContext): CreateTransactionResponse {
        return CreateTransactionResponse.Created
    }

}