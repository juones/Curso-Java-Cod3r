package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	// lista constante significa que
	// somente o endereço de memória da lista é constante e não poderá ser reinstanciada
	final List<Curso> cursos = new ArrayList<Curso>();
	
	Aluno(String nome) {
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {		
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return null;
	}
	
	//método utilizado para converter um objeto em string
	public String toString() {
		return nome;
	}

}
