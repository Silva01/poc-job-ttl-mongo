package br.net.silva.daniel.poc.mongo.ttl.infraestructure.schedule

import br.net.silva.daniel.poc.mongo.ttl.domain.scheduling.dto.SchedulingDTO
import br.net.silva.daniel.poc.mongo.ttl.domain.scheduling.factory.SchedulingFactory
import br.net.silva.daniel.poc.mongo.ttl.infraestructure.component.SchedulingComponent
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.util.UUID

@Component
class JobStart(@Autowired private val component: SchedulingComponent) {

    @Scheduled(cron = "0 0/1 * * * *")
    fun start(): Unit {
        println("Iniciado")
        val userCase = SchedulingFactory.instanceSchedulingUserCase(component)
        val uuid = UUID.randomUUID()
        val dto = SchedulingDTO(uuid.toString(), "Bolivon-${uuid}", LocalDateTime.now())
        userCase.toRecord(dto)
        println("Finalizado")
    }
}