package br.com.rp.repository.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.com.rp.domain.Log;
import br.com.rp.domain.Usuario;
import br.com.rp.repository.UsuarioRepository;

@Stateless
public class UsuarioRepositoryImpl extends AbstractRepositoryImpl<Usuario> implements UsuarioRepository {

	public UsuarioRepositoryImpl() {
		super(Usuario.class);
	}
	
}
