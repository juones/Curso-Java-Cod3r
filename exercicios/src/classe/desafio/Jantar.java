//Jantar.java
package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Junior", 96.3);
		
		Pessoa p2 = new Pessoa("Taty", 45.4);
		
		Comida c1 = new Comida("Arroz", 0.4);
		
		Comida c2 = new Comida("Feijão", 0.2);
		
		Comida c3 = new Comida("Bife", 0.5);
		
		System.out.println(p1.apresentar());
		System.out.println(p2.apresentar());
		
		
		p1.comer(c1);
		p1.comer(c2);
		p1.comer(c3);
		p1.comer(c3);
		System.out.println("");
		p2.comer(c1);
		p2.comer(c2);
		p2.comer(c3);
		
		p1.apresentarFinal();
		p2.apresentarFinal();
	}

}
