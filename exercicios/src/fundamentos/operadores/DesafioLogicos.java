package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		//trabalho na terça (V ou F)
		//trabalho na quinta (V ou F)
		// Se os 2 trabalhos derem certo, ir pro shop e comprar TV 50p
		// Se apenas um der certo TV de 32
		// Comprando qualquer TV familia toma sorvete
		// Se nenhum der certo a familia fica em casa
		
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean tomouSorvete = trabalho1 || trabalho2;
		boolean continuaSaudavel = !tomouSorvete; //operador unário
		
		System.out.println("Comprou TV 50? " + comprouTv50);
		System.out.println("Comprou TV 32? " + comprouTv32);
		System.out.println("Tomou sorvete? " + tomouSorvete);
		System.out.println("Continua saudável? " + continuaSaudavel);
		
	}

}
