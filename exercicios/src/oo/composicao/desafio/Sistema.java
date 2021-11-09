package oo.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Junior");

		Compra compra1 = new Compra();
		//utilizando o método da linha 15
		compra1.adicionarItem("Caneta", 9.67, 100);
		//utilizando o método da linha 11
		compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);
		
		Compra compra2 = new Compra();
		//utilizando o método da linha 15
		compra2.adicionarItem("Caderno", 10, 10);
		//utilizando o método da linha 11
		compra2.adicionarItem(new Produto("Impressora", 998.90), 1);
		

		cliente1.adicionarCompra(compra1);
		cliente1.compras.add(compra2);
		
		System.out.println(cliente1.obterValorTotal());
	}

}
