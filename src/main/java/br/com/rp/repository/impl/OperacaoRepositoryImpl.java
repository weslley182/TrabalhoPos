package br.com.rp.repository.impl;

import java.util.Date;

import javax.ejb.Stateless;

import br.com.rp.domain.Conta;
import br.com.rp.domain.Operacao;
import br.com.rp.domain.OperacaoRepository;
import br.com.rp.domain.TipoOperacao;
import br.com.rp.domain.Usuario;



@Stateless
public class OperacaoRepositoryImpl extends AbstractRepositoryImpl<Operacao> implements OperacaoRepository {

	public OperacaoRepositoryImpl() {
		super(Operacao.class);
	}
	
	//@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	//public Operacao save(Operacao object) {
	//	return super.save(object);
	//}
	
	public Long realizarSaque(Double valor, Conta conta) throws Exception{
		conta.sacar(valor);
		Operacao operacao = new Operacao();
		operacao.setContaOrigem(conta);
		operacao.setDataRealizacao(new Date());
		operacao.setTipoOperacao(TipoOperacao.SAQUE);
		operacao.setValor(valor);	
		
		return save(operacao).getId();
	}	
}
