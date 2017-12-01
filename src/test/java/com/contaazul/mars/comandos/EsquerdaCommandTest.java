package com.contaazul.mars.comandos;

import org.junit.Assert;
import org.junit.Test;

import com.contaazul.mars.dominio.Robo;
import com.contaazul.mars.dominio.enums.Orientacao;

public class EsquerdaCommandTest {
	
	@Test
	public void esquerdaCommandOrientacaoNorteTest() {
		Robo robo = new Robo();
		Assert.assertEquals(robo.getOrientacao(), Orientacao.NORTH);
		new EsquerdaCommand(robo).execute();
		Assert.assertEquals(robo.getOrientacao(), Orientacao.WEST);
	}

	@Test
	public void esquerdaCommandOrientacaoOesteTest() {
		Robo robo = new Robo();
		robo.getPosicao().setOrientacao(Orientacao.WEST);
		new EsquerdaCommand(robo).execute();
		Assert.assertEquals(robo.getOrientacao(), Orientacao.SOUTH);
	}

	@Test
	public void esquerdaCommandOrientacaoSulTest() {
		Robo robo = new Robo();
		robo.getPosicao().setOrientacao(Orientacao.SOUTH);
		new EsquerdaCommand(robo).execute();
		Assert.assertEquals(robo.getOrientacao(), Orientacao.EAST);
	}

	@Test
	public void esquerdaCommandOrientacaoLesteTest() {
		Robo robo = new Robo();
		robo.getPosicao().setOrientacao(Orientacao.EAST);
		new EsquerdaCommand(robo).execute();
		Assert.assertEquals(robo.getOrientacao(), Orientacao.NORTH);
	}

	@Test
	public void esquerdaCommand360VoltaTest() {
		Robo robo = new Robo();
		new EsquerdaCommand(robo).execute();
		new EsquerdaCommand(robo).execute();
		new EsquerdaCommand(robo).execute();
		new EsquerdaCommand(robo).execute();
		Assert.assertEquals(robo.getOrientacao(), Orientacao.NORTH);
	}
}
