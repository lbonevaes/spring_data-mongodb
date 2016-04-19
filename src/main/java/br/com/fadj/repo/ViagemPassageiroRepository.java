package br.com.fadj.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.fadj.domain.ViagemPassageiro;

/* INTERFACE REPOSITORIO VIAGEM PASSAGEIRO PARA FILTROS PROPRIOS */

public interface ViagemPassageiroRepository extends MongoRepository<ViagemPassageiro, Long>{

}
