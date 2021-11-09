package oo.encapsulamento.casaA;

public class Paulo {
	
	void testeAcessos () {
		Ana esposa = new Ana();
		//System.out.println(esposa.segredo); privado
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}

}