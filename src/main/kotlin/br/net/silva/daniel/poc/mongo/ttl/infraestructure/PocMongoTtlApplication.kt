package br.net.silva.daniel.poc.mongo.ttl.infraestructure

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
@EnableMongoRepositories(basePackages = ["br.net.silva.daniel.poc.mongo.ttl.infraestructure.repository"])
class PocMongoTtlApplication

fun main(args: Array<String>) {
    runApplication<PocMongoTtlApplication>(*args)
}
