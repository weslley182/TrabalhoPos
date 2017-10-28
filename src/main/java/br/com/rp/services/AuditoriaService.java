package br.com.rp.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.rp.domain.Auditoria;
import br.com.rp.repository.AuditoriaRepository;

@Stateless
public class AuditoriaService {

	@EJB
	private AuditoriaRepository repository;

	public Long save(Auditoria auditoria) {
		return repository.save(auditoria).getId();
	}
}

