package br.com.rp.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.rp.domain.Proposta;
import br.com.rp.repository.PropostaRepository;



@Path("/proposta")
@Consumes("application/json")
@Produces("application/json")
public class PropostaRest {

	@EJB
	private PropostaRepository repo;

	@POST
	public Long salvarProposta(Proposta proposta) {
		return repo.save(proposta).getId();

	}
}
