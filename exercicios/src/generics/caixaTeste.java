package generics;

public class caixaTeste {
	
	public static void main(String[] args) {
		
		//com o Tipo generico String meus métodos get e set já estarão definidos com string
		Caixa <String> caixaA = new Caixa<>();
		caixaA.guardar("Hello Generics");
		
		//String coisaA = caixaA.abrir();
		System.out.println(caixaA.abrir());
		
		Caixa <Double> caixaB = new Caixa<>();
		caixaB.guardar(2.3);
		
		//String coisaB = caixaB.abrir();
		System.out.println(caixaB.abrir());
		
	}

}
