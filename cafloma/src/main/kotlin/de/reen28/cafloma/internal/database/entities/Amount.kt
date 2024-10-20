package de.reen28.cafloma.internal.database.entities

import jakarta.persistence.Embeddable

@Embeddable
data class Amount(
    val value: Long,
    val currency: String
)