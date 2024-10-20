package de.reen28.cafloma.internal.database.entities

import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter
import java.time.Duration

@Converter(autoApply = true)
class PeriodConverter: AttributeConverter<Duration, String> {

    override fun convertToDatabaseColumn(period: Duration?): String? {
        return period?.let { "${it.seconds} seconds" }
    }

    override fun convertToEntityAttribute(serializedPeriod: String?): Duration? {
        return serializedPeriod?.let {
            val periodParts: List<String> = it.split(" ")
            if(periodParts.size != 2) {
                throw IllegalArgumentException("Unsupported period")
            }
            Duration.ofSeconds(periodParts[0].toLong())
        }
    }
}