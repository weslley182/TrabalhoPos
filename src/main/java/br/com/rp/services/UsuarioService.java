package br.com.rp.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.rp.domain.Log;
import br.com.rp.domain.Usuario;
import br.com.rp.repository.LogRepository;
import br.com.rp.repository.UsuarioRepository;
@Stateless
public class UsuarioService {

	@EJB
	private UsuarioRepository repository;

	public Long save(Usuario usuario) {
		return repository.save(usuario).getId();
	}
}
