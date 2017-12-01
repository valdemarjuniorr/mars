package com.contaazul.mars.comandos;

import com.contaazul.mars.dominio.Posicao;
import com.contaazul.mars.dominio.Robo;
import com.contaazul.mars.dominio.enums.Direcao;
import com.contaazul.mars.dominio.enums.Orientacao;
import com.contaazul.mars.util.AbstractCommand;

public class DireitaCommand extends AbstractCommand {

	public DireitaCommand(Robo robo) {
		super(Direcao.DIREITA);
		this.robo = robo;
	}
	
	@Override
	public void execute() {
		Orientacao orientacao = getRobo().getOrientacao();
		Posicao posicao = getRobo().getPosicao();
		switch (orientacao) {
			case NORTH:
				posicao.setOrientacao(Orientacao.EAST);
				break;
			case EAST:
				posicao.setOrientacao(Orientacao.SOUTH);
				break;
			case SOUTH:
				posicao.setOrientacao(Orientacao.WEST);
				break;
			case WEST:
				posicao.setOrientacao(Orientacao.NORTH);
				break;
			default:
				throw new IllegalStateException("Não é possível virar a direita");
		}
	}
}
