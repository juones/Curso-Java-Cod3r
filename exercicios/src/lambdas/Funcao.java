package lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		//funcão criada para compor a parOuImpar
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		Function<String, String> duvida = valor -> valor + "???";
		
		
		
		//com o .andThen posso utilizar as duas funcoes
		//como as funcoes subsequentes recebem e resultam em string elas se auto alimentam
		String resultadoFinal1 = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32); //parametro passado para a primeira função, o restante consome os resultados
		
		
		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(33); //parametro passado para a primeira função, o restante consome os resultados
		
		System.out.println(resultadoFinal1);
		System.out.println(resultadoFinal2);
		//também é possível utilizá-las unitariamente
		System.out.println(parOuImpar.apply(33));

//		// executar uma função consumindo a outra
//		System.out.println(oResultadoE.apply(resultadoFinal));
	}

}
