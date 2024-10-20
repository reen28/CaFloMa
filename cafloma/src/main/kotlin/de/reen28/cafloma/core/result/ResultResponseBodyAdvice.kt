package de.reen28.cafloma.core.result

import de.reen28.cafloma.core.result.cases.HttpStatusCodeResultCase
import org.springframework.core.MethodParameter
import org.springframework.http.MediaType
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.server.ServerHttpRequest
import org.springframework.http.server.ServerHttpResponse
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice

/**
 * This class will ensure that the status code specified by [HttpStatusCodeResultCase]
 * is set in the response.
 */
@ControllerAdvice
class ResultResponseBodyAdvice: ResponseBodyAdvice<Result<HttpStatusCodeResultCase>> {

    override fun supports(returnType: MethodParameter, converterType: Class<out HttpMessageConverter<*>>): Boolean
        = returnType.parameterType == Result::class.java

    override fun beforeBodyWrite(
        body: Result<HttpStatusCodeResultCase>?,
        returnType: MethodParameter,
        selectedContentType: MediaType,
        selectedConverterType: Class<out HttpMessageConverter<*>>,
        request: ServerHttpRequest,
        response: ServerHttpResponse
    ): Result<HttpStatusCodeResultCase>? {
        body?.apply { response.setStatusCode(case.statusCode()) }
        return body
    }


}