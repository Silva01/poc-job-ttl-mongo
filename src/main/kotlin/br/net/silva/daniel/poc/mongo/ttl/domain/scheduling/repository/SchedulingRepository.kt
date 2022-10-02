package br.net.silva.daniel.poc.mongo.ttl.domain.scheduling.repository

import br.net.silva.daniel.poc.mongo.ttl.domain.scheduling.dto.SchedulingDTO

interface SchedulingRepository {
    fun toRecord(schedulingDTO: SchedulingDTO)
}