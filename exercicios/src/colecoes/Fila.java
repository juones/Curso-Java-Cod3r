package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		//em Java para setar uma fila é necessário chamar o linkedList
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// DIferença é o comportamrnto quando a fila está cheia
		fila.add("Ana"); //add gera um erro
		fila.offer("Bia"); //offer retorna um false
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		for(String queue : fila) {
			System.out.println(queue);
		}
		// Existem duas maneiras de pegar valores da fila
		// Peek e Element -> Obtem o próximo elemento da fila sem remover
		// Geram diferentes comportamentos quando a fila está vazia
		System.out.println(fila.peek()); // peek retorna null
		System.out.println(fila.element()); // element gera um erro
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty(); // Para saber se a fila está ou não vazia
		// fila.contains(..)
		
		// Existem duas maneiras de remover valores da fila
		// Poll e Remove -> Obtem o próximo elemento da fila e o removem
		// Geram diferentes comportamentos quando a fila está vazia
		System.out.println(fila.poll()); //retorna um null
		System.out.println(fila.remove()); //retorna um erro
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); 
		System.out.println(fila.remove());

	}

}