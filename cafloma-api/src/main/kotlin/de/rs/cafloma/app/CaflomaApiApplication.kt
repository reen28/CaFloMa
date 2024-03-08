package de.rs.cafloma.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CaflomaApiApplication

fun main(args: Array<String>) {
	runApplication<CaflomaApiApplication>(*args)
}
