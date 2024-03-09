package de.rs.cafloma.app.api.transaction.ext

import de.rs.cafloma.app.api.transaction.ext.contexts.CreateTransactionContext
import de.rs.cafloma.app.api.transaction.ext.responses.CreateTransactionResponse
import de.rs.cafloma.app.api.transaction.sys.TransactionService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
data class TransactionController(val transactionService: TransactionService) {

    @PostMapping(path = ["transactions"])
    fun createTransaction(@Valid @RequestBody createTransactionContext: CreateTransactionContext): CreateTransactionResponse =
        transactionService.createTransaction(createTransactionContext)

}