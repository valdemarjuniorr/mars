package com.contaazul.mars.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComandoControllerTest {

	private static final String _0_2_W = "(0, 2, W)";
	private static final String _400_BAD_REQUEST = "400 Bad Request";
	@Autowired
	private ComandoController controller;
	
	@Test
	public void executaComandoMoveMoveEsquerdaTest() {
		String comando = controller.recebeComando("MML");
		Assert.assertEquals(_0_2_W, comando);
	}

	@Test
	public void executaComandoMoveMoveDireita2xTest() {
		String comando = controller.recebeComando("MMRMMRMM");
		Assert.assertEquals("(2, 0, S)", comando);
	}

	@Test
	public void executaComandoNaoGuardaEstadoOkTest() {
		String comando = controller.recebeComando("MML");
		Assert.assertEquals(_0_2_W, comando);
		
		comando = controller.recebeComando("MML");
		Assert.assertEquals(_0_2_W, comando);
	}
	
	@Test
	public void comandoInvalidoTest() {
		String comando = controller.recebeComando("AAA");
		Assert.assertEquals(_400_BAD_REQUEST, comando);
		
	}

	@Test
	public void comandoSaiDaAreaEspecificadaTest() {
		String comando = controller.recebeComando("MMMMMMMMMMMMMMMMMMMMMMMM");
		Assert.assertEquals(_400_BAD_REQUEST, comando);
	}
}
