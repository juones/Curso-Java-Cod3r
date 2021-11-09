package br.com.cod3r.app.financeiro;

import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;

public class Teste {
	
	public static void main(String[] args) {
		
		Calculadora calc = ServiceLoader
				.load(Calculadora.class) //método que seta a classe
				.findFirst() //pegar a primeira implementacao encontrada nessa interface 
				.get();
				
		System.out.println(calc.soma(2, 3, 4));
	}
}