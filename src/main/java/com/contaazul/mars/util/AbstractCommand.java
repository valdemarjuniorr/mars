package com.contaazul.mars.util;

import com.contaazul.mars.dominio.Robo;
import com.contaazul.mars.dominio.enums.Direcao;

import lombok.Getter;

public abstract class AbstractCommand implements Command {

	@Getter
	protected Direcao direcao;
	
	@Getter
	protected Robo robo;

	protected AbstractCommand(Direcao direcao) {
		this.direcao = direcao;
	}
	
}
