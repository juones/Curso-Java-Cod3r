package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {
	
	/* 
	 * Desafio:
	 * 		 /calculadora/somar/10/20
	 * 		/calculadora/subtrair?a=10&b=20
	 */


	//http://localhost:8080/calculadora/somar/20/5
	@GetMapping(path = "/somar/{a}/{b}")
	public int somar(@PathVariable int a, @PathVariable int b) {
		int soma = a + b;
		return soma;
	}
	
	//http://localhost:8080/calculadora/subtrair?a=20&b=5
	@GetMapping(path = "/subtrair")
	public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
		int subtrair = a - b;
		return subtrair;
	}
}
