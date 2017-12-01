package com.contaazul.mars.util;

import com.contaazul.mars.dominio.enums.Direcao;

public interface Command {
	
	public Direcao getDirecao();
	
	public abstract void execute();

}
