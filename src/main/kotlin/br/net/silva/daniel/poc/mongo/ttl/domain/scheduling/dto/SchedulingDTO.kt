package br.net.silva.daniel.poc.mongo.ttl.domain.scheduling.dto

import java.time.LocalDateTime

data class SchedulingDTO(
    val id: String,
    val name: String,
    val expiredDate: LocalDateTime
)