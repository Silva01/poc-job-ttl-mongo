package br.net.silva.daniel.poc.mongo.ttl.infraestructure.component

import br.net.silva.daniel.poc.mongo.ttl.domain.scheduling.dto.SchedulingDTO
import br.net.silva.daniel.poc.mongo.ttl.domain.scheduling.repository.SchedulingRepository
import br.net.silva.daniel.poc.mongo.ttl.infraestructure.model.LogScheduling
import br.net.silva.daniel.poc.mongo.ttl.infraestructure.repository.LogSchedulingRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SchedulingComponent(@Autowired private val repository: LogSchedulingRepository): SchedulingRepository {
    override fun toRecord(schedulingDTO: SchedulingDTO) {
        val entity = LogScheduling(schedulingDTO.id, schedulingDTO.name, schedulingDTO.expiredDate)
        repository.save(entity)
    }
}