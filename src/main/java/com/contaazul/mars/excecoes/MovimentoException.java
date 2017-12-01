package com.contaazul.mars.excecoes;

public class MovimentoException extends IllegalArgumentException {

	private static final long serialVersionUID = -6180250887834759385L;
	
	public MovimentoException() {
		super("400 Bad Request");
	}


}
