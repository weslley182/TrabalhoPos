package br.com.rp.repository.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.com.rp.domain.Endereco;
import br.com.rp.repository.EnderecoRepository;

@Stateless
public class EnderecoRepositoryImpl extends AbstractRepositoryImpl<Endereco> implements EnderecoRepository {
	
	public EnderecoRepositoryImpl() {
		super(Endereco.class);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public Endereco save(Endereco object) {
		return super.save(object);
	}

}
