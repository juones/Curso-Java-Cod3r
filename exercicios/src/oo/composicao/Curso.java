package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	final String nome;
	// lista constante significa que
	// somente o endereço de memória da lista é constante e não poderá ser reinstanciada
	final List<Aluno> alunos = new ArrayList<Aluno>();
	
	Curso(String nome) {
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}

}
