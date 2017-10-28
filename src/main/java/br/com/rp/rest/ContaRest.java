package br.com.rp.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.rp.domain.Conta;
import br.com.rp.domain.Usuario;
import br.com.rp.repository.ContaRepository;
import br.com.rp.repository.UsuarioRepository;

@Path("/conta")
@Consumes("application/json")
@Produces("application/json")
public class ContaRest {

	@EJB
	private ContaRepository repo;

	@POST
	public Long salva(Conta conta) {
		return repo.save(conta).getId();

	}
}
