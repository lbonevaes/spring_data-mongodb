package br.com.fadj.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.fadj.domain.Pessoa;

/* INTERFACE REPOSITORIO PESSOA PARA FILTROS PROPRIOS */

public interface PessoaRepository  extends MongoRepository<Pessoa, Long> {

}

