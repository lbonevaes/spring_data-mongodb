package br.com.fadj.service;

import org.springframework.context.ApplicationContext;

import br.com.fadj.domain.Pessoa;
import br.com.fadj.repo.PessoaRepository;
import br.com.herbertrausch.util.SpringUtil;

public class PessoaService {

	private PessoaRepository db;
	
	/* METODO CARREGA BEAN PESSOA */
	
	public PessoaService(){
	
		ApplicationContext context =SpringUtil.getContext();
		db =  context.getBean(PessoaRepository.class);
		
	}
	
	/* METODO ENCAPSULA INSERT DO SPRING */
	
	public void insere(Pessoa pessoa){
		db.save(pessoa);
	}
	
	/* METODO ENCAPSULA DELETE DO SPRING */
	
	public void delete(Long id){
		db.delete(id);
	}
	
	/* METODO ENCAPSULA UPDATE DO SPRING */

	public void update(Pessoa p) {
		db.save(p);		
	}
	
	/* METODO ENCAPSULA METODO BUSCAR UM REGISTRO PELO ID DO SPRING */
	
	public Pessoa find(Long id){
		return db.findOne(id);
	}
	
}
