package br.net.silva.daniel.poc.mongo.ttl.usercase.scheduling

import br.net.silva.daniel.poc.mongo.ttl.domain.scheduling.dto.SchedulingDTO
import br.net.silva.daniel.poc.mongo.ttl.domain.scheduling.repository.SchedulingRepository

class SchedulingUserCase(private val repository: SchedulingRepository) {
    fun toRecord(schedulingDTO: SchedulingDTO): Unit {
        repository.toRecord(schedulingDTO)
    }
}