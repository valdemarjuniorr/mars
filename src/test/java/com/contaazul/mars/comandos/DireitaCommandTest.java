package com.contaazul.mars.comandos;

import org.junit.Assert;
import org.junit.Test;

import com.contaazul.mars.dominio.Robo;
import com.contaazul.mars.dominio.enums.Orientacao;


public class DireitaCommandTest {
	
	@Test
	public void direitaCommandOrientacaoNorteTest() {
		Robo robo = new Robo();
		Assert.assertEquals(robo.getOrientacao(), Orientacao.NORTH);
		new DireitaCommand(robo).execute();
		Assert.assertEquals(robo.getOrientacao(), Orientacao.EAST);
	}

	@Test
	public void direitaCommandOrientacaoOesteTest() {
		Robo robo = new Robo();
		robo.getPosicao().setOrientacao(Orientacao.EAST);
		new DireitaCommand(robo).execute();
		Assert.assertEquals(robo.getOrientacao(), Orientacao.SOUTH);
	}

	@Test
	public void direitaCommandOrientacaoSulTest() {
		Robo robo = new Robo();
		robo.getPosicao().setOrientacao(Orientacao.SOUTH);
		new DireitaCommand(robo).execute();
		Assert.assertEquals(robo.getOrientacao(), Orientacao.WEST);
	}

	@Test
	public void direitaCommandOrientacaoLesteTest() {
		Robo robo = new Robo();
		robo.getPosicao().setOrientacao(Orientacao.WEST);
		new DireitaCommand(robo).execute();
		Assert.assertEquals(robo.getOrientacao(), Orientacao.NORTH);
	}

	@Test
	public void direitaCommand360VoltaTest() {
		Robo robo = new Robo();
		new DireitaCommand(robo).execute();
		new DireitaCommand(robo).execute();
		new DireitaCommand(robo).execute();
		new DireitaCommand(robo).execute();
		Assert.assertEquals(robo.getOrientacao(), Orientacao.NORTH);
	}
}
