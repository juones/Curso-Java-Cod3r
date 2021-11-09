package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "C recebe outro texto";
		System.out.println(c);
		
		
		double d; //variável foi declarada
		d = 123.65; // foi inicializada
		System.out.println(d);
		
		//errado
//		var e;
//		e = 123.45;
		
		//certo
		var e = 123.45;
		
		System.out.println(e);
	}

}
