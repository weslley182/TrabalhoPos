package br.com.rp.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.rp.domain.Motivo;
import br.com.rp.repository.MotivoRepository;


@Path("/motivo")
@Consumes("application/json")
@Produces("application/json")
public class MotivoRest {

	@EJB
	private MotivoRepository repo;

	@POST
	public Long salvarMotivo(Motivo motivo) {
		return repo.save(motivo).getId();

	}
}

