//AreaCirc.java
package classe;

public class AreaCirc {
	
	double raio;
	// O static indica que s variável pertence à classe
	static final double PI = 3.1415;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area () {
		return PI * Math.pow(raio, 2);
	}
	
	// Também é possível criar um método static
	static double area (double raio) {
		return PI * Math.pow (raio, 2);
	}
}
