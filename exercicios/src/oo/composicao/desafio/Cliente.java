package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String nome;
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	List<Compra> compras = new ArrayList<Compra>();
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}

	double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.obterValorTotalPorCompra();
		}
		return total;
	}
}