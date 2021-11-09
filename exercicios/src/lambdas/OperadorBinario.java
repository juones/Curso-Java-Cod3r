package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		//O operador binario recebe dois valores e retorna um terceiro (todos do mesmo tipo)
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		
		System.out.println(media.apply(9.8, 5.7));
		
		//Uma BiFunction recebe dois valores e retorna outro (os 3 podem ser distintos)
		BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
		
		//outra possibilidade de estrutura para uma bifunction
		BiFunction<Double, Double, String> resultado1 = (n1, n2) -> {
			double notaFinal = ((n1 + n2) / 2);
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};

		
		System.out.println(resultado.apply(9.8, 5.7));
		System.out.println(resultado1.apply(9.7, 4.1));
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		
		String resultadoFinal = media
				.andThen(conceito)
				.apply(9.8, 5.7);
		
		System.out.println(resultadoFinal);
	}

}
