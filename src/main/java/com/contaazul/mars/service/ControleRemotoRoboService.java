package com.contaazul.mars.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.contaazul.mars.dominio.Marte;
import com.contaazul.mars.util.Command;
import com.contaazul.mars.util.builder.CommandBuilder;

@Component
public class ControleRemotoRoboService implements Serializable {
	
	private static final long serialVersionUID = 438049485472484857L;

	public String executarComando(String comandosUrl) {
		List<Command> comandos = new ArrayList<>();
		Marte marte = new Marte(5, 5);
		
		try {
			comandos = Arrays.asList(comandosUrl.split("(?!^)")).stream()
				.map(comando -> CommandBuilder.criar(comando, marte.getRobo()))
				.collect(Collectors.toList());
			comandos.stream().forEach(comando -> marte.getRobo().mover(comando));
			
			return marte.posicaoRobo();
			
		} catch (IllegalArgumentException e) {
			return e.getMessage();
		}
	}

}
