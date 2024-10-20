package de.reen28.cafloma.core.result.cases

/**
 * A base interface representing a generic result case, either a success or an error.
 * Provides a default implementation for the [name] method, which returns the simple name
 * of the implementing class.

 * @since 1.0
 */
interface ResultCase {
    /**
     * Returns the simple class name of the implementing class.
     * @return the simple class name of the implementing class.
     */
    fun name(): String = this.javaClass.simpleName
}