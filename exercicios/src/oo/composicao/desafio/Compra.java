package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;


public class Compra {
	
	List<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	// Método para adicionar um item já com um produto instanciado
	void adicionarItem(String nome, double preco, int quantidade) {
		var produto = new Produto (nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}
	
	double obterValorTotalPorCompra() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}	
		return total;
	}

}
