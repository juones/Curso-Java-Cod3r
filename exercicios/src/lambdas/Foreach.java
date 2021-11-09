package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		
		System.out.println("Forma tradicional....");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		
		
		System.out.println("\nLambda #01...");
		aprovados.forEach((nome) -> {System.out.println(nome + "!!!"); } );
		
		System.out.println("\nMethod Reference #01...");
		// o :: do syso já passa o nome como referencia de parametro para o println
		aprovados.forEach(System.out::println);
		
		
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		
		System.out.println("\nMethod Reference #02...");
		// o :: do syso já passa o nome como referencia de parametro para o println
		aprovados.forEach(Foreach::meuImprimir);

	}
	
	//criado o método static abaixo e duplicados os foreachs utilizando esse método
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é " + nome);
	}

}
