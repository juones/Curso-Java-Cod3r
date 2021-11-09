package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		//Como o map possui um par chave e valor como dus colunas
		//posso setar os dois tipos de dados que vão entrar
		Map<Integer, String> usuarios = new HashMap<>();
		
		//map não possui o método add, é necessário utilizar o put
		//o Put tanto adiciona o valor no map quando substitui(atualiza) dados existentes
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		//para saber todas a chaves do map
		System.out.println(usuarios.keySet());
		//para saber os valors
		System.out.println(usuarios.values());
		//para saber os doias ao mesmo tempo
		System.out.println(usuarios.entrySet());
		
		//para saber se o usuario contem certa chave ou certo valor
		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("Rebeca"));
		
		// em Map, diferente de lista onde o get solicita o índice
		// no Get do map eu devo colocar a chave
		System.out.println(usuarios.get(2));
		
		//também é possível utilizar o remove (retornando um boolean no print
		System.out.println(usuarios.remove(1)); //é possível somente pela chave
		System.out.println(usuarios.remove(2, "Rebeca")); // passando chave e valor com os valores incorretos ele retorna false
		
		//para percorrer as chaves
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		//para percorrer os valores
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		//para percorrer a chave e o valor ao mesmo tempo
		// é necessário importar o Entry e chamar o entrySet no foreach
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " -> ");
			System.out.println(registro.getValue());
		}
	}

}
