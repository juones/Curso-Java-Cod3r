package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		//Para setar uma pilha é necessário importar o Deque e ArrayDeque
		Deque<String> livros = new ArrayDeque<String>();
		
		// Add e Push -> adicionam elementos na fila
		// DIferença é o comportamrnto quando a fila está cheia
		livros.add("O Senhor dos anéis"); // retorna boolean
		livros.push("The Witcher"); // retorna erro se atingir limite
		livros.push("Ready Player One");
		
		for(String livro : livros) {
			System.out.println(livro);
		}
		
		//os métodos para obter os valores da pilha são os mesmos da fila
		// a firefença é que como a pilha é LIFO o último dado inserido será o primeiro apresentado
		System.out.println(livros.peek()); // peek retorna null
		System.out.println(livros.element()); // element gera um erro
		
		
		System.out.println(livros.poll());
		System.out.println(livros.pop()); // pop funciona como o remove no erro gerado
		System.out.println(livros.poll());
		//System.out.println(livros.remove());
		//System.out.println(livros.poll()); //retorna um null quando a fila está vazia
		//System.out.println(livros.remove()); //retorna um erro quando a fila está vazia
	}

}
