package br.com.rp.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.rp.domain.Motivo;
import br.com.rp.repository.MotivoRepository;

@Stateless
public class MotivoService {

	@EJB
	private MotivoRepository repository;

	public Long save(Motivo motivo) {
		return repository.save(motivo).getId();
	}
}
