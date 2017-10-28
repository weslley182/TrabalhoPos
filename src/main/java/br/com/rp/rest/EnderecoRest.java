package br.com.rp.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.rp.domain.Endereco;
import br.com.rp.repository.EnderecoRepository;

@Path("/endereco")
@Consumes("application/json")
@Produces("application/json")
public class EnderecoRest {
	
	@EJB
	private EnderecoRepository repo;

	@POST
	public Long salva(Endereco endereco) {
		return repo.save(endereco).getId();

	}

}
