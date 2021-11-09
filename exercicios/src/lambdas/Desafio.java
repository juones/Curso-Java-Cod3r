package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		/*
		 * 1. A partir do produto, calcular o preço real (com desconto) | (Feito)
		 * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)        |
		 * 3. Frete: >= 3000 (100) / < 3000 (50)                        |
		 * 4. Arredondar: Deixar duas casas decimais                    |
		 * 5. Formatar: R$1234.56                                       |
		 *
		 */
		
		Function<Produto, Double> precoFinal = prod -> prod.preco * (1 - prod.desconto);

		// Para calculos com porcentagem abaixo de 10 ou com .5 como por exemplo 8,5, é necessário utilizar 1.085
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
		
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
		//formatamos as casas decimais para arredondar em String e depois a convertemos a bouble com o parseDouble
		UnaryOperator<Double> arredondamento = preco -> Double.parseDouble(String.format("%.2f", preco));
		
		Function<Double, String> formatar = preco -> ("R$ " + preco).replace(".", ".");
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondamento)
				.andThen(formatar)
				.apply(p);
				
		System.out.println(precoFinal.apply(p));
		System.out.println("O preço final é " + preco);
				
	}

}
