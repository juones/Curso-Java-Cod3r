package fundamentos;

public class temperatura {
	
	public static void main(String[] args) {
		// (F* - 32) x 5/9 = C
		//F e C serão variáveis e os números serão constantes
		// Para evitar o erro, sempre usar números reais 5.0/9.0
		
		final double ajuste = 32;
		final double multiplicador = 5.0/9.0;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - ajuste) * multiplicador;
		
		//para ter o ˚ basta digitar option + k
		System.out.println("O resultado é : " + celsius + " ˚C.");
		
		fahrenheit = 150;
		celsius = (fahrenheit - ajuste) * multiplicador;
		
		System.out.println("O resultado é : " + celsius + " ˚C.");
		System.out.println("O resultado é : " + celsius + " ˚C.");

		
		
	}

}
