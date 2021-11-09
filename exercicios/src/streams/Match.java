package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		
		//o match serve para saber se certa situação ocorreu com certo valor
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Predicate<Aluno> reprovados = aprovados.negate();
		
		// para saber se todos os alunos foram aprovados, retorna falso pq um deles tirou nota baixa
		System.out.println(alunos.stream().allMatch(aprovados));
		// para saber se algum foi aprovado, se assemelha ao OU ||
		System.out.println(alunos.stream().anyMatch(aprovados));
		//se nenhum bate ou foi aprovado
		System.out.println(alunos.stream().noneMatch(aprovados));
		//também é possível negar o valor
		System.out.println(alunos.stream().noneMatch(reprovados));
	}

}
