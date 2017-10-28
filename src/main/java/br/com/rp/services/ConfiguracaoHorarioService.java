package br.com.rp.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.rp.domain.ConfiguracaoHorario;
import br.com.rp.domain.Usuario;
import br.com.rp.repository.ConfiguracaoHorarioRepository;
import br.com.rp.repository.UsuarioRepository;

@Stateless
public class ConfiguracaoHorarioService {

	@EJB
	private ConfiguracaoHorarioRepository repository;

	public Long save(ConfiguracaoHorario configuracaoHorario) {
		return repository.save(configuracaoHorario).getId();
	}
}
