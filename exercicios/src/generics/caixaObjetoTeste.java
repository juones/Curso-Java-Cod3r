package generics;

public class caixaObjetoTeste {
	
	public static void main(String[] args) {
		
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); //double -> Double (transform em wrapper automaticamente)
		
		Double coisa = (Double) caixaA.abrir(); //necessário sempre fazer o Cast nesse tipo de situação
		System.out.println(coisa);
	
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Hello");
	
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
	}
		
}