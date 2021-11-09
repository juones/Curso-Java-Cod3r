package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Civic;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro fiesta = new Civic(160);
		Ferrari ferrari = new Ferrari(250);
		//ferrari.ligarTurbo();
		//ferrari.ligarAr();
		
		System.out.println(fiesta);
		System.out.println(ferrari);
		
		fiesta.acelerar();
		fiesta.acelerar();
		System.out.println(fiesta);
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(ferrari);
		
		fiesta.frear();
		ferrari.frear();
		
		System.out.println(fiesta);
		System.out.println(ferrari);	
	}

}
