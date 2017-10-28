package br.com.rp.interceptors;

import java.util.Date;

import javax.ejb.EJB;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import br.com.rp.domain.Auditoria;
import br.com.rp.domain.Operacao;
import br.com.rp.domain.OperacaoRepository;
import br.com.rp.repository.AuditoriaRepository;
import br.com.rp.repository.LogRepository;
import br.com.rp.view.ViewModelOperacaoSaque;

public class AuditoriaInterceptor {

	@EJB
	private AuditoriaRepository auditoriaRepository;

	@EJB
	private OperacaoRepository operacaoRepository;

	@AroundInvoke
	public Object realizarAuditoria(InvocationContext context) throws Exception {
		Long operacaoId = 0l;
		
		try {
			operacaoId = (Long) context.proceed();
			return operacaoId;
		} finally {
			salvarAuditoria(operacaoId);
			
		}

	}

	public void salvarAuditoria(Long operacaoId) {
		Auditoria auditoria = new Auditoria();
		auditoria.setData(new Date());
		Operacao operacao = operacaoRepository.findById(operacaoId);
		auditoria.setOperacao(operacao);
		auditoria.setUsuario(operacao.getContaOrigem().getUsuario());
		auditoriaRepository.save(auditoria);
	}
}
