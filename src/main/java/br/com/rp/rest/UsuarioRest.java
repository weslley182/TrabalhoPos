package br.com.rp.rest;


import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.rp.domain.Usuario;
import br.com.rp.repository.UsuarioRepository;

@Path("/usuario")
@Consumes("application/json")
@Produces("application/json")
public class UsuarioRest {

	@EJB
	private UsuarioRepository repo;

	@POST
	public Long salvarUsuario(Usuario usuario) {
		return repo.save(usuario).getId();

	}
}
