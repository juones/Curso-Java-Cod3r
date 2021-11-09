package fundamentos.operadores;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; //c = c + b;
		c -= a; //c = c - a;
		c *= b; //c = c * b;
		c /= a; //c = c / a;
		c %= 2; // módulo para saber se c é par ou impar. Se retornar 0 é par e 1 é impar.
		
		System.out.println(c);
		
	}

}
