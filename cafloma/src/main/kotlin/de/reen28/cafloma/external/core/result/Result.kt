package de.reen28.cafloma.external.core.result

import de.reen28.cafloma.external.core.result.cases.ErrorResultCase
import de.reen28.cafloma.external.core.result.cases.ResultCase
import de.reen28.cafloma.external.core.result.cases.SuccessResultCase

/**
 * A generic class that represents a result, either a success or an error, based on the [ResultCase] provided.
 * This class is constructed via companion object methods [success] and [error].
 *
 * Example usage:
 * ```kotlin
 * val successResult: Result<SuccessResultCase> = Result.success(SuccessCaseImpl())
 * val errorResult: Result<ErrorResultCase> = Result.error(ErrorCaseImpl())
 * ```
 *
 * @param C The type of the result case, which must extend [ResultCase].
 *
 * @since 1.0
 */
class Result<out C: ResultCase>
    private constructor(val case: C) {

    /**
     * Companion object providing factory methods for creating [Result] instances.
     */
    companion object {

        /**
         * Creates a [Result] object representing a success case.
         *
         * @param C The type of the success case, which must implement [SuccessResultCase].
         * @param case The success case instance.
         * @return A [Result] containing the success case.
         */
        fun <C: SuccessResultCase> success(case: C): Result<C> {
            return Result(case)
        }

        /**
         * Creates a [Result] object representing an error case.
         *
         * @param C The type of the error case, which must implement [ErrorResultCase].
         * @param case The error case instance.
         * @return A [Result] containing the error case.
         */
        fun <C: ErrorResultCase> error(case: C): Result<C> {
            return Result(case)
        }
    }
}