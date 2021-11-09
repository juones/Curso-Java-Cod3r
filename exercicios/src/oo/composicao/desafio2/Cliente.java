package oo.composicao.desafio2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String nome;
	
	Cliente (String nome) {
		this.nome = nome;
	}

	List<Compra> compras = new ArrayList<Compra>();
	
	//método precisa receber um objeto compra
	void adicionarCompra (Compra compra) {
		this.compras.add(compra);
	}
	
	double obterTotalFinal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.obterTotalPorCompra();
		}	
		return total;
	}
	
	
}
