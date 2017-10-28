package br.com.rp.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.rp.domain.Conta;
import br.com.rp.repository.ContaRepository;

@Stateless
public class ContaService {

	@EJB
	private ContaRepository repository;

	public Long save(Conta conta) {
		return repository.save(conta).getId();
	}
}
