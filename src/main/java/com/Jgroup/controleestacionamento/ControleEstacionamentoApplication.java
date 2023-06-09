package com.Jgroup.controleestacionamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ControleEstacionamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleEstacionamentoApplication.class, args); }

	@GetMapping("/")
	public String index(){
		return "Controle de estacionamento de um condominio";
	}
}
