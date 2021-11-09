package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	//nesse caso uma compra possui vários itens mas o item só tem uma compra
	ArrayList<Item> itens = new ArrayList<Item>();
	
	//para tornar a relação bidirecional
	//posso adicionar os métodos abaixo e utilizá-lo em CompraTeste
	//sem a necessidade de isntanciar um item cada vez que este for adicionado
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	//o método abaixo é chamado pelo método acima
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
		
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}	
		return total;
	}

}
