package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares <C extends Number, V>{

	private final Set <Par <C, V>> itens = new LinkedHashSet<>(); //o linkedHashSet garante a ordem de inclusão dos valores
	
	public void adicionar (C chave, V valor) {
		//mesmo com o método sendo void, utilizar somente um return,
		//serve para que a execução saia do método caso o valor seja nulo
		if(chave == null) return;
		
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		//como só foi criado equals e Hashcode para a chave, o valor não será verificado no contains
		if(itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		itens.add(novoPar);
	}
	
	public V getValor (C chave) {
		if(chave == null) return null;
		
		Optional<Par <C, V>> parOpcional = itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		
		//para substituir o if posso usar um ternário
		return parOpcional.isPresent() 
				? parOpcional.get().getValor() : null;
	}
}
