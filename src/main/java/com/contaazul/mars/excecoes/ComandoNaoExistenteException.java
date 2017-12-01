package com.contaazul.mars.excecoes;

public class ComandoNaoExistenteException extends IllegalArgumentException {

	private static final long serialVersionUID = 5806511548435728154L;
	
	public ComandoNaoExistenteException() {
		super("400 Bad Request");
	}

}
