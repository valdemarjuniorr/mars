package com.contaazul.mars.dominio;

import com.contaazul.mars.dominio.enums.Orientacao;
import com.contaazul.mars.util.Command;

import lombok.Data;

@Data
public class Robo {
	
	private Posicao posicao = new Posicao();
	
	public Orientacao getOrientacao() {
		return posicao.getOrientacao();
	}
	
	public void mover(Command comando) {
		comando.execute();
	}
}
