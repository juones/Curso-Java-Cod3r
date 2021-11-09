package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	void testeAcessos () {
		
		Ana sogra = new Ana();
		//System.out.println(esposa.segredo); privado
		//System.out.println(sogra.facoDentroDeCasa); default pacote
		//System.out.println(sogra.formaDeFalar); somente poe herança
		System.out.println(sogra.todosSabem);
	}

}
