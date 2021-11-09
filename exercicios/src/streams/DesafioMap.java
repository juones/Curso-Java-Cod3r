package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::println;
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		/*
		 * 1. Converter o número para a sua representação binaria em string... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 * 
		 * Dica, a maioria das funcoes estara na classe Integer
		 */
		
		
		Function<Integer, String> paraBinario = i -> Integer.toBinaryString(i);
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		//para o parse entender que quero um valor binário é necessário o , 2
		Function<String, Integer> binarioParaInt = i -> Integer.parseInt(i, 2);
				
		nums.stream()
			.map(paraBinario)
			.map(inverter)
			.map(binarioParaInt)
			.forEach(print);
		
		//Resposta
		System.out.println("\nResposta do professor");
		nums.stream()
		//não é necessário criar o paraBinario
		.map(Integer::toBinaryString)
		.map(inverter)
		.map(binarioParaInt)
		.forEach(print);
		
	}

}
