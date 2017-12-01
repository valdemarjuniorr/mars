package com.contaazul.mars.dominio.enums;

import lombok.Getter;

public enum Orientacao {
	// Norte, Sul, Oeste, Leste
	NORTH("N"), SOUTH("S"), EAST("E"), WEST("W");
	
	@Getter
	private String codigo;
	
	Orientacao(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return getCodigo();
	}
}
