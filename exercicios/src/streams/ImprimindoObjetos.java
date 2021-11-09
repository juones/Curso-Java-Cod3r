package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		// o comportamento funcionaria para qualquer generics 
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		
		System.out.println("\n Usando o for");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		System.out.println("\n Usando o forEach");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\n Usando o Iterator");
		//o Iterator executa sempre que houver um proximo elemendo na fila
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\n Usando Stream");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); //Laço interno!!!
	}
}
