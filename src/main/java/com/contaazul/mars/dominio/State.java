package com.contaazul.mars.dominio;

import com.contaazul.mars.dominio.enums.Orientacao;

public interface State {
	
	public Orientacao virarDireita();
	
	public Orientacao virarEsquerda();

}
