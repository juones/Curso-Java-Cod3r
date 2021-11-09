package arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		//foreach existe para percorrer um array de maneira mais fácil sem a necessidade do contador no indice
		double[] notas = { 9.9, 8.7, 7.2, 9.4 };
		
		//feito com for
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		//feito com foreach
		for(double nota: notas) {
			System.out.print(nota + " ");
		}
		
	}

}
