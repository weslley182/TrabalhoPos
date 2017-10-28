package br.com.rp.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.rp.domain.Operacao;
import br.com.rp.domain.OperacaoRepository;


@Stateless
public class OperacaoService {

	@EJB
	private OperacaoRepository repository;

	public Long save(Operacao operacao) {
		return repository.save(operacao).getId();
	}
}
