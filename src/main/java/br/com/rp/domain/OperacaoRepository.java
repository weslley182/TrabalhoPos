package br.com.rp.domain;

import br.com.rp.repository.Repository;

public interface OperacaoRepository extends Repository<Operacao> {

	public Long realizarSaque(Double valor, Conta conta) throws Exception;
}

