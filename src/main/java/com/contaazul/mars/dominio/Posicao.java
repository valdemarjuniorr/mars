package com.contaazul.mars.dominio;

import com.contaazul.mars.dominio.enums.Orientacao;

import lombok.Data;

@Data
public class Posicao {
	
	private Integer horizontal = 0;
	private Integer vertical = 0;
	
	private Orientacao orientacao = Orientacao.NORTH;
	
	@Override
	public String toString() {
		return "( " + horizontal + ", " + vertical + ", " + orientacao + " )";
	}
	
	public void incrementaHorizontal() {
		++horizontal;
	}

	public void incrementaVertical() {
		++vertical;
	}
	
	public void decrementaHorizontal() {
		--horizontal;
	}

	public void decrementaVertical() {
		--vertical;
	}
}