package de.rs.cafloma.app.api.core.ext.response

import org.springframework.core.MethodParameter
import org.springframework.http.MediaType
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.server.ServerHttpRequest
import org.springframework.http.server.ServerHttpResponse
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice


@RestControllerAdvice
class ResponseHttpStatusCodeMapper: ResponseBodyAdvice<ResponseHttpStatusCodeProvider> {
    override fun supports(returnType: MethodParameter, converterType: Class<out HttpMessageConverter<*>>): Boolean =
        ResponseHttpStatusCodeProvider::class.java.isAssignableFrom(returnType.parameterType)

    override fun beforeBodyWrite(
        body: ResponseHttpStatusCodeProvider?,
        returnType: MethodParameter,
        selectedContentType: MediaType,
        selectedConverterType: Class<out HttpMessageConverter<*>>,
        request: ServerHttpRequest,
        response: ServerHttpResponse
    ): ResponseHttpStatusCodeProvider? {
        body?.let { response.setStatusCode(it.status()) }
        return body
    }
}