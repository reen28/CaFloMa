package de.reen28.cafloma.core.result

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import org.springframework.stereotype.Component

/**
 * This class will ensure that the content of [Result]
 * is serialized and set as the response body.
 */
@Component
class ResultCaseSerializer: JsonSerializer<Result<*>>() {

    override fun serialize(result: Result<*>?,
                           gen: JsonGenerator?,
                           serializers: SerializerProvider?) {
        gen?.apply {
            if (result != null) {
                writeObject(result.case)
            }
        }
    }
}