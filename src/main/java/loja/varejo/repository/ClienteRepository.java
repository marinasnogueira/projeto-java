package loja.varejo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import loja.varejo.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
