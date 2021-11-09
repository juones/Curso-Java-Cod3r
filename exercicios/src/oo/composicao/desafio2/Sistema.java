package oo.composicao.desafio2;

public class Sistema {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente ("Junior");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Playstation 5", 4000, 1);
		compra1.adicionarItem("DualSense", 400, 1);
		
		Compra compra2 = new Compra();
		compra1.adicionarItem("Xbox Series X", 4000, 1);
		compra1.adicionarItem("Controle", 400, 1);
		
		
		cliente1.adicionarCompra(compra1);
//		cliente1.adicionarCompra(compra2);
//		
//		cliente1.compras.add(compra1);
		cliente1.compras.add(compra2);
		
		System.out.println(cliente1.obterTotalFinal());
		
		
	}
		
}
