package br.com.rp.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.rp.domain.Proposta;
import br.com.rp.repository.PropostaRepository;



@Stateless
public class PropostaService {

	@EJB
	private PropostaRepository repository;

	public Long save(Proposta proposta) {
		return repository.save(proposta).getId();
	}
}
