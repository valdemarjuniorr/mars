package com.contaazul.mars.util.builder;

import java.util.Objects;

import com.contaazul.mars.comandos.DireitaCommand;
import com.contaazul.mars.comandos.EsquerdaCommand;
import com.contaazul.mars.comandos.MoveCommand;
import com.contaazul.mars.dominio.Robo;
import com.contaazul.mars.dominio.enums.Direcao;
import com.contaazul.mars.excecoes.ComandoNaoExistenteException;
import com.contaazul.mars.excecoes.MovimentoException;
import com.contaazul.mars.util.Command;

public final class CommandBuilder {

	private CommandBuilder() {
	}

	public static <T> Command criar(String comando, Robo robo) {
		return criar(Direcao.get(comando), robo);
	}
	
	public static Command criar(Direcao direcao, Robo robo) {
		if (Objects.isNull(direcao)) {
			throw new MovimentoException();
		}
		switch (direcao) {
			case DIREITA:
				return new DireitaCommand(robo);
			case ESQUERDA:
				return new EsquerdaCommand(robo);
			case FRENTE:
				return new MoveCommand(robo);
			default:
				throw new ComandoNaoExistenteException();
		}
	}
}
