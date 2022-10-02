package br.net.silva.daniel.poc.mongo.ttl.infraestructure.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.LocalDateTime
import java.util.*

@Document
data class LogScheduling(
    @Id val id: String,
    val name: String,
    @Field @Indexed(name = "expiratedDateIndex", expireAfterSeconds = 10) val expiratedDate: LocalDateTime
)