package br.com.rp.rest;

import javax.ejb.EJB;
import javax.interceptor.Interceptors;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.rp.domain.Conta;
import br.com.rp.domain.OperacaoRepository;
import br.com.rp.interceptors.AuditoriaInterceptor;
import br.com.rp.interceptors.HorarioInterceptor;
import br.com.rp.repository.ContaRepository;
import br.com.rp.repository.impl.OperacaoRepositoryImpl;
import br.com.rp.view.ViewModelOperacaoSaque;

@Path("/operacao")
@Consumes("application/json")
@Produces("application/json")
public class OperacaoRest {

	@EJB
	private OperacaoRepository repo;

	@EJB
	private ContaRepository repoConta;

	@POST
	@Path("/sacar")
	@Interceptors({AuditoriaInterceptor.class,HorarioInterceptor.class })
	public Long sacar(ViewModelOperacaoSaque viewModelOperacaoSaque)throws Exception {
		
		try{
			Conta conta = repoConta.findById(viewModelOperacaoSaque.getIdConta());
			Long operacaoId = repo.realizarSaque(viewModelOperacaoSaque.getValor(),
					conta);
			repoConta.save(conta).getValorSaldo();
			return operacaoId;
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
			return 0l;
			
		}
		
	}
}
