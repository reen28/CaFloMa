package de.rs.cafloma.app.api.transaction.out

import de.rs.cafloma.app.api.transaction.out.contexts.CreateTransactionContext
import de.rs.cafloma.app.api.transaction.out.responses.CreateTransactionResponse
import de.rs.cafloma.app.api.transaction.sys.TransactionService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
data class TransactionController(val transactionService: TransactionService) {

    @PostMapping(path = ["transactions"])
    fun createTransaction(@RequestBody createTransactionContext: CreateTransactionContext): CreateTransactionResponse =
        transactionService.createTransaction(createTransactionContext)

}