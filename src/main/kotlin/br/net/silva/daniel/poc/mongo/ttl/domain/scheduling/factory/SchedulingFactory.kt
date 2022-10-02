package br.net.silva.daniel.poc.mongo.ttl.domain.scheduling.factory

import br.net.silva.daniel.poc.mongo.ttl.domain.scheduling.repository.SchedulingRepository
import br.net.silva.daniel.poc.mongo.ttl.usercase.scheduling.SchedulingUserCase

class SchedulingFactory {
    companion object {
        fun instanceSchedulingUserCase(repository: SchedulingRepository): SchedulingUserCase = SchedulingUserCase(repository)
    }
}