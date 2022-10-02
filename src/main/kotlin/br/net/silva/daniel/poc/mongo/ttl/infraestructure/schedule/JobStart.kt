package br.net.silva.daniel.poc.mongo.ttl.infraestructure.schedule

import br.net.silva.daniel.poc.mongo.ttl.domain.scheduling.dto.SchedulingDTO
import br.net.silva.daniel.poc.mongo.ttl.domain.scheduling.factory.SchedulingFactory
import br.net.silva.daniel.poc.mongo.ttl.infraestructure.component.SchedulingComponent
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.util.UUID

@Component
class JobStart(@Autowired private val component: SchedulingComponent) {

    private val log = LoggerFactory.getLogger("JobStart")

    @Scheduled(cron = "0 0/1 * * * *")
    fun start(): Unit {
        log.info("Iniciando Job")
        log.info("Gerando registro para ser gravado no mongoDB")
        val userCase = SchedulingFactory.instanceSchedulingUserCase(component)

        log.info("Gerando UUID")
        val uuid = UUID.randomUUID()
        val dto = SchedulingDTO(uuid.toString(), "Bolivon-${uuid}", LocalDateTime.now())

        log.info("Gravando dados na base de dados")
        userCase.toRecord(dto)
        log.info("Job encerrado com sucesso")
    }
}