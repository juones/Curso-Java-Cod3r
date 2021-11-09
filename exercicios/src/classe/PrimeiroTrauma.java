//PrimeiroTrauma.java
package classe;

public class PrimeiroTrauma {
	
	int a = 3; // não pode mexer aqui
	static int b = 4;
	
	public static void main(String[] args) {
		
		//dentro de um método static como o main, só é possível manipular uma variável de instancia como int a criando uma instancia
		PrimeiroTrauma p = new PrimeiroTrauma();
		
		System.out.println(p.a);
		System.out.println(b);
	}
}
