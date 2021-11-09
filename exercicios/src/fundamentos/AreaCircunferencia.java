package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {		
		double raio = 3.4;
		final double pi = 3.14159;
		
		double area = pi * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = pi * raio * raio;
		//também é possível concaternar um texto com uma variável
		System.out.println("Área = " + area);
	}

}
