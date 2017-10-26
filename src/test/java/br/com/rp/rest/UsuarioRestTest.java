package br.com.rp.rest;

import static org.junit.Assert.assertNotNull;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.junit.Assert;
import org.junit.Test;

import br.com.rp.domain.Usuario;

public class UsuarioRestTest extends AbstractRestTest {

	private static final String URL = "http://localhost:8080/vbank/api/";
	
	
	
	
	@Test
	public void deveSalvarUsuario() {
		Usuario usuario1 = new Usuario();
		usuario1.setCpf("07616673937");
		usuario1.setEmail("wesley.faznada@hotmail.com");
		usuario1.setNome("Wesley Safadao");
		usuario1.setSenha("123456789");
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URL + "usuario");
		Long result = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(Entity.entity(usuario1, MediaType.APPLICATION_JSON),Long.class);
		
		Assert.assertTrue(result > 0);
	}
}
