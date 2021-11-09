package oo.encapsulamento.casaB;

// Como ana está em outro pacote é necessário importá-la
import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos () {
		
		//System.out.println(segredo); privado
		//System.out.println(facoDentroDeCasa); pacote/default
		System.out.println(formaDeFalar); //somente é possível receber por herança
		System.out.println(todosSabem);
	}

}
