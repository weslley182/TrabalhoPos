package br.com.rp.repository.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.com.rp.domain.Proposta;
import br.com.rp.repository.PropostaRepository;



@Stateless
public class PropostaRepositoryImpl extends AbstractRepositoryImpl<Proposta> implements PropostaRepository {

	public PropostaRepositoryImpl() {
		super(Proposta.class);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public Proposta save(Proposta object) {
		return super.save(object);
	}
	
}

