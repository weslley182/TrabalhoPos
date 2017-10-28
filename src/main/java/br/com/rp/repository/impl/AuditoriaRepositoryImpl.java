package br.com.rp.repository.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.com.rp.domain.Auditoria;
import br.com.rp.domain.Conta;
import br.com.rp.repository.AuditoriaRepository;

@Stateless
public class AuditoriaRepositoryImpl extends AbstractRepositoryImpl<Auditoria> implements AuditoriaRepository{

	public AuditoriaRepositoryImpl() {
		super(Auditoria.class);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public Auditoria save(Auditoria object) {
		return super.save(object);
	}

}
