package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (acumulador, n) -> acumulador + n;
		
		//diferente do map e do filter, o reduce não é uma funcão intermediatia e sim uma finalizadora
		// necessário utilizar o get
		// nesse caso é possível adicionar o resultado da operação em uma variável para ser impressa
		Integer total1 = nums.stream().reduce(soma).get();
		System.out.println(total1);
		
		//setanto o valor inicial não é necessário usar o get
		Integer total2 = nums.stream().reduce(100, soma);
		System.out.println(total2);
		
		//resultado foi um Opcional<Integer>...
		nums.stream()
				.filter(n -> n > 5)
				.reduce(soma)
				//se tiver resultado válido presente ele executa a função abaixo
				.ifPresent(System.out::println);
	}

}
