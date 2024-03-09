package de.rs.cafloma.app.api.transaction.ext.contexts

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank

data class CreateTransactionContext(@field:NotBlank(message = CREATE_TRANSACTION_TITLE_REQUIRED)
                                    @field:Min(message = CREATE_TRANSACTION_TITLE_BELOW_MIN_LENGTH, value = 3)
                                    @field:Max(message = CREATE_TRANSACTION_TITLE_ABOVE_MAX_LENGTH, value = 50)
                                    val title: String?
) {
    companion object ConstraintKeys {
        const val CREATE_TRANSACTION_TITLE_REQUIRED = "CREATE_TRANSACTION_TITLE_REQUIRED"
        const val CREATE_TRANSACTION_TITLE_BELOW_MIN_LENGTH = "CREATE_TRANSACTION_TITLE_BELOW_MIN_LENGTH"
        const val CREATE_TRANSACTION_TITLE_ABOVE_MAX_LENGTH = "CREATE_TRANSACTION_TITLE_ABOVE_MAX_LENGTH"
    }
}

