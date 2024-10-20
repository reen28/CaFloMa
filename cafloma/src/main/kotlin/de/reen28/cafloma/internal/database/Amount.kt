package de.reen28.cafloma.internal.database

import jakarta.persistence.Embeddable
import java.util.Currency

@Embeddable
data class Amount(
    val value: Long,
    val currency: Currency
)