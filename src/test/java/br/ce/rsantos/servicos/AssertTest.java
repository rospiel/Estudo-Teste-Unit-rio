package br.ce.rsantos.servicos;

import org.junit.Assert;
import org.junit.Test;

import br.ce.rsantos.entidades.Usuario;


public class AssertTest {
	
	@Test
	public void test() {
		/* Considera��es Importantes */
		/* 1� Sempre informe uma mensagem erro caso o teste falhe */
		/* 2� Sempre coloque o objeto esperado e o recebido nas entradas respectivas do m�todo usado, ajuda identificar o erro */
		/* 3� A maioria dos m�todos tem sua vers�o negativa */
		
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		Assert.assertEquals("Erro de compara��o de inteiros:", 1, 1);
		
		/* Quando se esta trabalhando com double se faz necess�rio informar um 3� par�metro de at� onde desejamos 
		   a igualdade pois em determinados casos como o PI n�o se tem o valor exato */
		Assert.assertEquals("Erro de compara��o de double:", 0.51234, 0.512, 0.001);
		Assert.assertEquals("Erro de compara��o com PI:", Math.PI, 3.14, 0.01);
		
		int i = 5;
		Integer i2  = 5;
		Assert.assertEquals("Erro de compara��o do objeto Integer:", Integer.valueOf(i), i2);
		Assert.assertEquals("Erro de compara��o do primitivo int:", i, i2.intValue());
		
		Assert.assertEquals("Erro de compara��o da primitiva string:", "school", "school");
		Assert.assertTrue("Erro de compara��o da primitiva string desconsiderando letras em caixa alta:", "school".equalsIgnoreCase("School"));
		Assert.assertTrue("Erro de compara��o do inicio da primitiva string:", "polite".startsWith("po"));
		
		Usuario usuario1 = new Usuario("Rodrigo");
		Usuario usuario2 = new Usuario("Rodrigo");
		
		Assert.assertEquals("Erro de compara��o do objeto Usuario:", usuario1, usuario2);
		Assert.assertSame("Erro de compara��o de inst�ncia do Usuario:", usuario1, usuario1);
		Assert.assertNotSame("Erro de compara��o de n�o igualdade de inst�ncia do objeto Usuario:", usuario1, usuario2);
		
		Usuario usuario3 = null;
		Assert.assertNull("Erro de igualdade nula sobre o objeto Usuario:", usuario3);
	}
}
