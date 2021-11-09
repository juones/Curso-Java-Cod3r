package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		//comand + shit + o (organiza os imports)
		//setando o tipo de dado entre os <> você torna o conjunto homogeneo
		
		//Set<String> listaAprovados = new HashSet<String>(); // o SashSet também pode ser HashSet<>()
		//Para trazer os valores por ordem de inserção é possível utilizar o SortedSet e o TreeSet
		SortedSet<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		// nums.get(3);  // não é possível acessar pelo índice
		
		for(int n: nums) {
			System.out.println(n);
		}
	}

}