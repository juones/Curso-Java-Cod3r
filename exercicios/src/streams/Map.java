package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	
	public static void main(String[] args) {
		
		//crio um consumer para reduzir o print
		Consumer<String> print = System.out::print;
		
		//crio uma lista de string
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		//crio o stram passando a lista para maiusculas
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		//criei a classe utilitários com as mesmas lambdas abaixo
		// UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		//recebo a primeira letra de uma palavra, como estou trabalhando com string
		//é necessário concatenar para não dar erro pelo char
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		// UnaryOperator<String> grito = n -> n + "!!! ";
		
		
		System.out.println("\nUsando composição");
		marcas.stream()
			.map(Utilitarios.maiuscula)
			.map(primeiraLetra)
			//passei uma referencia de metodo para grito criado na classe utilitarios
			.map(Utilitarios::grito)
			.forEach(print);
	}

}
