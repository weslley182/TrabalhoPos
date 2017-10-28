package br.com.rp.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.rp.domain.ConfiguracaoHorario;
import br.com.rp.domain.Usuario;
import br.com.rp.repository.ConfiguracaoHorarioRepository;
import br.com.rp.repository.UsuarioRepository;

@Path("/configuracaohorario")
@Consumes("application/json")
@Produces("application/json")
public class ConfiguracaoHorarioRest {

	@EJB
	private ConfiguracaoHorarioRepository repo;

	@POST
	public Long salvar(ConfiguracaoHorario configuracaoHorario) {
		return repo.save(configuracaoHorario).getId();

	}
}
