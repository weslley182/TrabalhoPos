package br.com.rp.interceptors;

import java.time.LocalTime;
import java.util.Date;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import br.com.rp.domain.Auditoria;
import br.com.rp.domain.Operacao;

public class HorarioInterceptor {

	@AroundInvoke
	public Object verificaHorario(InvocationContext context) throws Exception {
		
		LocalTime horarioInicial = LocalTime.of(6, 0);
		LocalTime horarioFinal = LocalTime.of(21, 30);
		LocalTime horarioAtual = LocalTime.now();
		//LocalTime horarioAtual = LocalTime.of(5, 0);
		if (horarioAtual.isAfter(horarioInicial)
				&& horarioAtual.isBefore(horarioFinal)) {
			return context.proceed();
		} else {
			System.out.println("Você está no horario errado amigão");
			//throw new RuntimeException("Esta operação deve acontecer entre as 06:00 e as 21:30.");
			return 0l;
		}

	}

}
