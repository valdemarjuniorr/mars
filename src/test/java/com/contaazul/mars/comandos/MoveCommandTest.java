package com.contaazul.mars.comandos;

import org.junit.Assert;
import org.junit.Test;

import com.contaazul.mars.dominio.Robo;
import com.contaazul.mars.dominio.enums.Orientacao;


public class MoveCommandTest {
	
	@Test
	public void moveCommmandOrientacaoNorteOkTest() {
		Robo robo = new Robo();
		Assert.assertEquals(Integer.valueOf(0), robo.getPosicao().getHorizontal());
		new MoveCommand(robo).execute();
		Assert.assertEquals(Integer.valueOf(0), robo.getPosicao().getHorizontal());
		Assert.assertEquals(Integer.valueOf(-1), robo.getPosicao().getVertical());
	}

	@Test
	public void moveCommmandOrientacaoOesteOkTest() {
		Robo robo = new Robo();
		robo.getPosicao().setOrientacao(Orientacao.EAST);
		Assert.assertEquals(Integer.valueOf(0), robo.getPosicao().getHorizontal());
		new MoveCommand(robo).execute();
		Assert.assertEquals(Integer.valueOf(1), robo.getPosicao().getHorizontal());
		Assert.assertEquals(Integer.valueOf(0), robo.getPosicao().getVertical());
	}

	@Test
	public void moveCommmandOrientacaoSulOkTest() {
		Robo robo = new Robo();
		robo.getPosicao().setOrientacao(Orientacao.EAST);
		Assert.assertEquals(Integer.valueOf(0), robo.getPosicao().getHorizontal());
		new MoveCommand(robo).execute();
		Assert.assertEquals(Integer.valueOf(1), robo.getPosicao().getHorizontal());
		Assert.assertEquals(Integer.valueOf(0), robo.getPosicao().getVertical());
	}

	@Test
	public void moveCommmandOrientacaoLesteTest() {
		Robo robo = new Robo();
		robo.getPosicao().setOrientacao(Orientacao.WEST);
		Assert.assertEquals(Integer.valueOf(0), robo.getPosicao().getHorizontal());
		new MoveCommand(robo).execute();
		Assert.assertEquals(Integer.valueOf(-1), robo.getPosicao().getHorizontal());
		Assert.assertEquals(Integer.valueOf(0), robo.getPosicao().getVertical());
	}

}
