package de.reen28.cafloma.internal.database.entities

import jakarta.persistence.Convert
import jakarta.persistence.Embeddable
import java.time.Duration
import java.time.LocalDateTime

@Embeddable
data class Frequency(
    val startsAt: LocalDateTime,
    val endsAt: LocalDateTime,
    @Convert(converter = PeriodConverter::class)
    val period: Duration
)