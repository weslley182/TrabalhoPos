package br.com.rp.repository.impl;

import javax.ejb.Stateless;

import br.com.rp.domain.ConfiguracaoHorario;
import br.com.rp.repository.ConfiguracaoHorarioRepository;

@Stateless
public class ConfiguracaoHorarioRepositoryImpl  extends AbstractRepositoryImpl<ConfiguracaoHorario> implements ConfiguracaoHorarioRepository{

	public ConfiguracaoHorarioRepositoryImpl() {
		super(ConfiguracaoHorario.class);
	}

}
