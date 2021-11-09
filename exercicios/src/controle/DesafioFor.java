package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";	
		}
		
		//versão do desafio
		// Não pode usar valor numérivo para controlar o laço!
		System.out.println("Desafio começa aqui");
		
		for (String v = "#"; !v.equals("######"); v+= "#") {
			System.out.println(v);
		}
		

		}

}




//String valor2 = "#";
//char cont = '.';
//String controlador = "";
//String termino = ".....";
//for(controlador = "."; controlador.equals(termino); controlador += cont) {
//	System.out.println(valor2);
//	valor2 += "#";