package com.contaazul.mars.comandos;

import com.contaazul.mars.dominio.Posicao;
import com.contaazul.mars.dominio.Robo;
import com.contaazul.mars.dominio.enums.Direcao;
import com.contaazul.mars.dominio.enums.Orientacao;
import com.contaazul.mars.util.AbstractCommand;

public class MoveCommand extends AbstractCommand {

	public MoveCommand(Robo robo) {
		super(Direcao.FRENTE);
		this.robo = robo;
	}

	@Override
	public void execute() {
		Orientacao orientacao = getRobo().getOrientacao();
		Posicao posicao = getRobo().getPosicao();
		switch (orientacao) {
			case NORTH:
				posicao.decrementaVertical();
				break;
			case EAST:
				posicao.incrementaHorizontal();
				break;
			case SOUTH:
				posicao.incrementaVertical();
				break;
			case WEST:
				posicao.decrementaHorizontal();
				break;
			default:
				throw new IllegalStateException("Não é possível mover para frente");
		}
	}
}
