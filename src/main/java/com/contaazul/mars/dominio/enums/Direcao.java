package com.contaazul.mars.dominio.enums;

import java.util.Arrays;

import lombok.Getter;

public enum Direcao {
	DIREITA("R"), ESQUERDA("L"), FRENTE("M");
	
	@Getter
	private String direcao;

	Direcao(String direcao) {
		this.direcao = direcao;
	}
	
	@Override
	public String toString() {
		return getDirecao();
	}
	
	public static final Direcao get(String codigoDirecao) {
		return Arrays.stream(values()).filter(direcao -> direcao.getDirecao().equals(codigoDirecao))
				.findFirst().orElse(null);
	}
}
