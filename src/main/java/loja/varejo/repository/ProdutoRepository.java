package loja.varejo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import loja.varejo.model.Produto;

public interface ProdutoRepository extends MongoRepository<Produto, String> {


}
