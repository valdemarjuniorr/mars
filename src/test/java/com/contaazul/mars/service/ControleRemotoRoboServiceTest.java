package com.contaazul.mars.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControleRemotoRoboServiceTest {
	
	private static final String _0_2_W = "(0, 2, W)";
	private static final String _400_BAD_REQUEST = "400 Bad Request";
	@Autowired
	private ControleRemotoRoboService service;
	
	@Test
	public void executaComandoMoveMoveEsquerdaTest() {
		String comando = service.executarComando("MML");
		Assert.assertEquals(_0_2_W, comando);
	}

	@Test
	public void executaComandoMoveMoveDireita2xTest() {
		String comando = service.executarComando("MMRMMRMM");
		Assert.assertEquals("(2, 0, S)", comando);
	}

	@Test
	public void executaComandoNaoGuardaEstadoOkTest() {
		String comando = service.executarComando("MML");
		Assert.assertEquals(_0_2_W, comando);
		
		comando = service.executarComando("MML");
		Assert.assertEquals(_0_2_W, comando);
	}
	
	@Test
	public void comandoInvalidoTest() {
		String comando = service.executarComando("AAA");
		Assert.assertEquals(_400_BAD_REQUEST, comando);
		
	}

	@Test
	public void comandoSaiDaAreaEspecificadaTest() {
		String comando = service.executarComando("MMMMMMMMMMMMMMMMMMMMMMMM");
		Assert.assertEquals(_400_BAD_REQUEST, comando);
	}

}
