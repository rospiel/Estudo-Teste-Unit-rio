package br.ce.rsantos.servicos;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.ce.rsantos.entidades.Filme;
import br.ce.rsantos.entidades.Locacao;
import br.ce.rsantos.entidades.Usuario;
import br.ce.rsantos.servicos.LocacaoService;
import br.ce.rsantos.utils.DataUtils;

public class LocacaoServiceTest {
	
	@Test
	public void teste() {
		LocacaoService locacaoService = new LocacaoService();
		Usuario usuario = new Usuario("Rodrigo");
		Filme filme = new Filme("Filme 1", 2, 5.0);
		
		Locacao locacao = locacaoService.alugarFilme(usuario, filme);
		
		Assert.assertEquals(5.0, locacao.getValor(), 0.01);
		Assert.assertTrue( DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		Assert.assertTrue( DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
	}
}
