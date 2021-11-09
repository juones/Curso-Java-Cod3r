package classe;

public class ValorNulo {
	
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!!!"));
		
		
		// o Math.random() gera um numero aleatório entre 0 e 1
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		//logica utilizada para evitar erros de runtime
		if(d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		// sem o null a string abaixo não inicializa e gera erro
		// com o null ele executa o programa mas gera erro de runtime
		String s2 = Math.random() > 0.5 ? "Opa": null; 
		
		if(s2 != null) {
			System.out.println(s2.concat("???"));
		}
		
	}

}
