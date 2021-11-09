package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		
		//IMPORTANTE: Para executar ações con instanciamento como na linha 31 e 34 é necessário setar o equals e o hashcode na classe em questão 
		
		//Também é possível utilizar o List(importanto claro) ao ivés do ArrayList no inicio
		List<Usuario> lista = new ArrayList<>();
		
		//Posso instancias um usuario para adicionar posteriormente à lista
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		//Ou posso adicioná-lo à lista durante a criação
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		//Para pegar um item de um indice específico
		System.out.println(lista.get(3));
		
		//Em lista é possível remover um valor de duas formas, pelo indice
		System.out.println(">>>>>>>> " + lista.remove(1)); //Usando o system out ele retorna o objeto que foi excluido
		// Ou por objeto
		System.out.println(lista.remove(new Usuario("Manu"))); //Usando o system out e é um objeto ele retorna um boolean
		
		//Para saber se a lista contém um item
		System.out.println("Contém? " + lista.contains(new Usuario("Lia")));		
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
	}

}
