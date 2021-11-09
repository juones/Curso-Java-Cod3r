package colecoes;

import java.util.HashSet;
import java.util.Set;

public class CunjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		//uma collection não suporta tipos primitivos ele converte os dados para os seus respectivos Wrappers
		
		//para adicionar valores ao conjunto
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Chatactere
		
		//para saber o tamanho ao inves de usar o .lengh usamos o método size
		System.out.println(conjunto.size());
		
		//para remover valores do conjunto
		System.out.println(conjunto.remove("Teste"));
		
		//para saber se o conjunto contém certo valor
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(2));
		System.out.println(conjunto.contains(true));
		
		
		//OUTRA OPÇÃO DE CRIAR UM SET EM JAVA
		// necessário importar o set de java util
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//no print ele já implementa para mostrar os valores como string
		System.out.println(nums);
		System.out.println(conjunto);
		
		//Para unir dois conjuntos
		//conjunto.addAll(nums); //união entre dois conjuntos
		
		//intercessão entre dois conjuntos
		conjunto.retainAll(nums); //mantém somente os valotes que os dois conjuntos possuem em comum
		System.out.println(conjunto);
		
		
		//para limpar o conjunto
		conjunto.clear();
		System.out.println(conjunto);

	}

}
