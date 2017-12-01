package com.contaazul.mars.util.builder;

import org.junit.Assert;
import org.junit.Test;

import com.contaazul.mars.dominio.Robo;
import com.contaazul.mars.dominio.enums.Direcao;
import com.contaazul.mars.util.Command;

public class CommandBuilderTest {
	
	private Robo robo = new Robo();
	
	@Test
	public void criaComandoFrenteOkTest() {
		Command move = CommandBuilder.criar("M", robo);
		Assert.assertEquals(Direcao.FRENTE, move.getDirecao());
	}

	@Test
	public void criaComandoFrenteEnumOkTest() {
		Command move = CommandBuilder.criar(Direcao.FRENTE, robo);
		Assert.assertEquals(Direcao.FRENTE, move.getDirecao());
	}

	@Test
	public void criaComandoDireitaOkTest() {
		Command move = CommandBuilder.criar("R", robo);
		Assert.assertEquals(Direcao.DIREITA, move.getDirecao());
	}
	
	@Test
	public void criaComandoDireitaEnumOkTest() {
		Command move = CommandBuilder.criar(Direcao.DIREITA, robo);
		Assert.assertEquals(Direcao.DIREITA, move.getDirecao());
	}
	
	@Test
	public void criaComandoEsquerdaOkTest() {
		Command move = CommandBuilder.criar("L", robo);
		Assert.assertEquals(Direcao.ESQUERDA, move.getDirecao());
	}
	
	@Test
	public void criaComandoEsquerdaEnumOkTest() {
		Command move = CommandBuilder.criar(Direcao.ESQUERDA, robo);
		Assert.assertEquals(Direcao.ESQUERDA, move.getDirecao());
	}

}
