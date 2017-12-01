package com.contaazul.mars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contaazul.mars.service.ControleRemotoRoboService;

@RestController
public class ComandoController {
	
	@Autowired
	private ControleRemotoRoboService controleService;
	
	/**
	 * Movimento com rotações para direita:
	 *	curl -s --request POST http://localhost:8080/rest/mars/MMRMMRMM
	 * @return
	 */
	@PostMapping("rest/mars/{comando}")
	public String recebeComando(@PathVariable String comando) {
		return controleService.executarComando(comando).toString();
	}

}
