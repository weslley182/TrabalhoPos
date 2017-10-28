package br.com.rp.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.rp.domain.Auditoria;
import br.com.rp.repository.AuditoriaRepository;

@Path("/auditoria")
@Consumes("application/json")
@Produces("application/json")
public class AuditoriaRest {

	@EJB
	private AuditoriaRepository repo;

	@POST
	public Long salvarAuditoria(Auditoria auditoria) {
		return repo.save(auditoria).getId();

	}
}