package oo.composicao;

public class Item {
	
	String nome;
	int quantidade;
	double preco;
	// para adicionar um relacionamento bidirecional, adiciono o objeto compra
	Compra compra;
	
	
	Item(String nome, int quantidade, double preco) {
		//this deve vir antes do operador de atribuição
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

}
