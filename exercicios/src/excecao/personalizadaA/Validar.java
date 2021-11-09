package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {
	
	private Validar() {}
	
	public static void aluno (Aluno aluno) {
		
		if (aluno == null) {
			throw new IllegalArgumentException("O aluno não pode ser nulo!");
		}
		
		//.trim retira os espaços em branco, mesmo com vários espaços no nome
		if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome"); //utilizando a exceção personalizada
		}
		
		if (aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota"); //utilizando a exceção personalizada
		}
	}
}
