package br.com.rp.repository.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import br.com.rp.domain.Conta;
import br.com.rp.repository.ContaRepository;

@Stateless
public class ContaRepositoryImpl extends AbstractRepositoryImpl<Conta> implements ContaRepository{

	public ContaRepositoryImpl() {
		super(Conta.class);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public Conta save(Conta object) {
		return super.save(object);
	}

}
