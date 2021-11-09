package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
		
		
		//BinaryOperator retirado da documentação funcional de java
		// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
		
		
		//NÃO: int -> double (por isso é necessário ser explicito ao passar os valores dos parametros
		//SIM: double -> double
		BinaryOperator<Double> calc = (x, y) -> { return x + y; };
		System.out.println(calc.apply(3.0, 3.0));
		
		//quando não se utilizam as chaves, o retorno é implicito
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(3.0, 3.0));
		
		
		BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; };
		System.out.println(calc2.apply(3, 3));
		
		//quando não se utilizam as chaves, o retorno é implicito
		calc = (x, y) -> x * y;
		System.out.println(calc2.apply(3, 3));

	}

}
