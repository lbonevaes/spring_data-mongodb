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

import br.com.fadj.domain.Viagem;
import br.com.fadj.service.ViagemService;

@Path("/viagem")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class ViagemResource {
	
	ViagemService vs = new ViagemService();
	
	/* URI PARA REGISTRAR VIAGEM */
	
	@POST
	public void save(Viagem v){
		
		vs.insere(v);
		
	}
	
	/* URI PARA EXCLUIR VIAGEM */
	
	@DELETE
	@Path("/delete/{id}")
	public void delete(@PathParam("id") String id) {
		vs.delete(Long.valueOf(id));
	}
	
	/* URI PARA ALTERAR DADOS CADASTRADOS DE VIAGEM */
	
	@PUT
	public void update(Viagem v){
		vs.update(v);
	}
	
	
	/* URI PARA RECUPERAR REGISTRO DE VIAGEM PELO ID */
	
	@GET
	@Path("/recupera/{id}")
	public Viagem find(@PathParam("id") String id){
		return vs.find(Long.valueOf(id));
	}

}
