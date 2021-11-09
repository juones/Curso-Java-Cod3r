package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		// Implementação da primeira lambda
		Calculo calc = (x, y) -> {
			return x + y;
		};
		
		System.out.println(calc.executar(3, 3));
		
		//quando não se utilizam as chaves, o retorno é implicito
		calc = (x, y) -> x * y;
		
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
	
	}

}
