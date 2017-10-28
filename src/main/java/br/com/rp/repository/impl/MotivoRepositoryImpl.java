package br.com.rp.repository.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.com.rp.domain.Motivo;
import br.com.rp.repository.MotivoRepository;

@Stateless
public class MotivoRepositoryImpl extends AbstractRepositoryImpl<Motivo> implements MotivoRepository {

	public MotivoRepositoryImpl() {
		super(Motivo.class);
	}
	

	
}
