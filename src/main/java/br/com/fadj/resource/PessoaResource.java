package br.com.fadj.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.fadj.domain.Pessoa;
import br.com.fadj.service.PessoaService;

@Path("/pessoa")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class PessoaResource {
	
	PessoaService ps = new PessoaService();
	
	/* URI PARA REGISTRAR PESSOA */
	
	@POST
	public void save(Pessoa p){
		
		ps.insere(p);
		
	}
	
	/* URI PARA EXCLUIR PESSOA */
	
	@DELETE
	@Path("/delete/{id}")
	public void delete(@PathParam("id") String id) {
		ps.delete(Long.valueOf(id));
	}
	
	
	/* URI PARA ALTERAR DADOS CADASTRADOS DE PESSOA */
	
	@PUT
	public void update(Pessoa p){
		ps.update(p);
	}
	
	
	/* URI PARA RECUPERAR REGISTRO DE PESSOA PELO ID */
	
	@GET
	@Path("/recupera/{id}")
	public Pessoa find(@PathParam("id") String id){
		return ps.find(Long.valueOf(id));
	}
	

}
