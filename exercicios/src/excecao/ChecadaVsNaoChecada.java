package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			//é possível utiliza o catch de forma polimorfica imprimindo a mensagem definicda para o erro
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
			//para tratar o erro de forma mais genérica posso definir um throwable
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim!");
	}
	
	// Exceção não checava | Não verificada
	static void geraErro1() {
		//para gerar um erro genérico
		throw new RuntimeException("Ocorreu um erro bem legal! #01");
	}
	
	// Exceção checava | Verificada
	static void geraErro2() throws Exception {
		// como essa é uma exceção checada, 
		//o throw só funciona se o método throws estiver setado na assinatura do método
		throw new Exception("Ocorreu um erro bem legal! #02");
	}
}
