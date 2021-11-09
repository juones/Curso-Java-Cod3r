package excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		//tratar o erro
		try {
			imprimirNomeDoAluno(a1);
			//se o comando do try falhar, será lançada uma excecao avisando
		} catch (Exception excecao) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usuário!");
		}
		
		//Selecinando a linha inteira > Surround With > Try/catch Block (comando para chegar automaticamente um block de try catch
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			//É possível gerar uma mensagem personalizada com o getMessagem quando á um erro identificado no compilador
			System.out.println("Ocorreu o erro: " + e.getMessage());
		}
		
		//não executa até que o erro seja tratado
		System.out.println("Fim :)");
		
	}
	
	//esse método fica vulnerável pois o objeto aluno pode ser instanciado nullo gerando um erro de compilacao
	public static void imprimirNomeDoAluno (Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
