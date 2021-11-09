package oo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.print("Estou matriculado no curso " + curso1.nome);
			System.out.println(" e meu nome é " + aluno.nome);
			System.out.println();
		}
		
		for(Aluno aluno: curso2.alunos) {
			System.out.print("Estou matriculado no curso " + curso2.nome);
			System.out.println(" e meu nome é " + aluno.nome);
			System.out.println();
		}
		
		for(Aluno aluno: curso3.alunos) {
			System.out.print("Estou matriculado no curso " + curso3.nome);
			System.out.println(" e meu nome é " + aluno.nome);
			System.out.println();
		}
		
		// para imprimir o valor de aluno é necessário setar o método toString na classe aluno como feito na linha 33
		//para consultar quais são os alunos matriculados no primeiro curso em que o aluno1 está matriculado
		System.out.println(aluno1.cursos.get(0).alunos); //consulta a lista de alunos macritulados no curso de indice 0
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}

}
