package br.com.fadj.service;

import org.springframework.context.ApplicationContext;

import br.com.fadj.domain.Viagem;
import br.com.fadj.repo.ViagemRepository;
import br.com.herbertrausch.util.SpringUtil;

public class ViagemService {
	
	private ViagemRepository db;
	
	/* METODO CARREGA BEAN VIAGEM */
	
	public ViagemService(){
	
		ApplicationContext context =SpringUtil.getContext();
		db =  context.getBean(ViagemRepository.class);
		
	}
	
	/* METODO ENCAPSULA INSERT DO SPRING */
	
	public void insere(Viagem viagem){
		db.save(viagem);
	}
	
	/* METODO ENCAPSULA DELETE DO SPRING */

	public void delete(Long id) {
		db.delete(id);
		
	}
	
	/* METODO ENCAPSULA UPDATE DO SPRING */
	
	public void update(Viagem v) {
		db.save(v);		
	}
	
	/* METODO ENCAPSULA METODO BUSCAR UM REGISTRO PELO ID DO SPRING */
	
	public Viagem find(Long id){
		return db.findOne(id);
	}
	
	

}
