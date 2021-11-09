package fundamentos.operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		//não recomendável
		int a = 97;
		int b = 'a'; //o valor de a na tabela unicode é 0096
		
		System.out.println(a == b);
		
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7); //diferente
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		
	}

}
