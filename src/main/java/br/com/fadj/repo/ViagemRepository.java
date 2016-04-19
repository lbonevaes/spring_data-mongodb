package br.com.fadj.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.fadj.domain.Viagem;

/* INTERFACE REPOSITORIO VIAGEM PARA FILTROS PROPRIOS */

public interface ViagemRepository extends MongoRepository<Viagem, Long>{

}
