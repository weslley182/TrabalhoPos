package br.com.rp.rest;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.junit.Assert;
import org.junit.Test;

import br.com.rp.domain.Proposta;
import br.com.rp.domain.Usuario;

public class PropostaRestTest extends AbstractRestTest {

	private static final String URL = "http://localhost:8080/vbank/api/";	
	
	@Test
	public void deveSalvarProposta() {
		Calendar calendar = new GregorianCalendar();
		Date date = new Date();
		calendar.setTime(date);		 ;
		
		Usuario usu = criarUsuario();
		System.out.println("Nome do Usuario: " + usu.getNome());		
		Proposta prop = new Proposta();
		prop.setDtEnvio(calendar.getTime());
		prop.setUsuario(usu);		
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URL + "proposta");
		Long result = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(Entity.entity(prop, MediaType.APPLICATION_JSON),Long.class);
		
		Assert.assertTrue(result > 0);
	}
	
	public Usuario criarUsuario(){
		Usuario usuario1 = new Usuario();
		usuario1.setCpf("07616673937");
		usuario1.setEmail("wesley.faznada@hotmail.com");
		usuario1.setNome("Wesley Safadao");
		usuario1.setSenha("123456789");
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URL + "usuario");
		Long id = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(Entity.entity(usuario1, MediaType.APPLICATION_JSON),Long.class);		
		usuario1.setId(id);
		System.out.println("ID do Usuario: " + usuario1.getId());
		return usuario1;		
	}
}
