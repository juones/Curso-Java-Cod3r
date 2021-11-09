package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
				
		Pessoa p1 = new Pessoa("Nivaldo", "Junior", -32);
		p1.setIdade(33); //alterar valor da variavel
		
		System.out.println(p1.getIdade()); //ler valor da variavel
		System.out.println(p1); // le o toString
	}

}
