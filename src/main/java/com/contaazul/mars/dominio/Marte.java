package com.contaazul.mars.dominio;

import com.contaazul.mars.dominio.enums.Orientacao;
import com.contaazul.mars.excecoes.MovimentoException;

import lombok.Getter;

@Getter
public class Marte implements Terreno {
	
	private final String[][] area;
	private Robo robo = new Robo();
	
	public Marte(Integer tamanhoHorizontal, Integer tamanhoVertical) {
		area = Terreno.criarEspaco(tamanhoHorizontal, tamanhoVertical);
		
		// Posição inicial que o robo inicializará
		Posicao posicaoInicialRobo = new Posicao();
		posicaoInicialRobo.setHorizontal(0);
		posicaoInicialRobo.setVertical(--tamanhoVertical);
		posicaoInicialRobo.setOrientacao(Orientacao.NORTH);
		
		robo.setPosicao(posicaoInicialRobo);
	}

	@Override
	public String[][] area() {
		return area;
	}
	
	public String posicaoRobo() {
		try {
			return "(" + getArea()[robo.getPosicao().getHorizontal()][robo.getPosicao().getVertical()] + ", "+ robo.getOrientacao() + ")";
		} catch (IndexOutOfBoundsException e) {
			throw new MovimentoException();
		}
	}
}