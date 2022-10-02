package br.net.silva.daniel.poc.mongo.ttl.infraestructure.repository

import br.net.silva.daniel.poc.mongo.ttl.infraestructure.model.LogScheduling
import org.springframework.data.mongodb.repository.MongoRepository

interface LogSchedulingRepository : MongoRepository<LogScheduling, String> {
}