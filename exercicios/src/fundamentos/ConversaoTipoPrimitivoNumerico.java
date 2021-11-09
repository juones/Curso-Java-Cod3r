package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		//uma conversão implicita acontece quando você converte um tipo menor para um maior
		//como no exemplo abaixo onde um double recebe um int:
		
		double a = 1; //implícita
		System.out.println(a);
		
		float b = (float) 1.123456788888; // explícita (CAST)
		System.out.println(b);
		
		int c = 20;
		byte d = (byte) c; //explícita (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; //explícita (CAST)
		System.out.println(f);
		
		
	}

}
