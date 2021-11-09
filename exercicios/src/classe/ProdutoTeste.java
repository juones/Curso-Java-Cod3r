//ProcutoTeste.java

package classe;

public class ProdutoTeste {
	
	//quando as classes estão dentro do mesmo pacote, não é necessário fazer importação
	
	public static void main(String[] args) {
		
		// na importação a Classe será o tipo, e o atributo será o new Classe()
		// new é a palavra que antecede o  construtor que recebe o nome da classe
		
		
		// Como foi definido um construtor explixito, foi necessário passar o nome na chamada do construtor
		//Em contra partida posso chamar o construtor com uma linha só
		Produto p1 = new Produto("Notebook", 4356.89);
		
		//Agora com o construtor padrão redefinido é possível chamar o construtor das duas formas
		//também é possível criar como no exemplo abaixo
		
		Produto.desconto = 0.50;
		
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
		
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		//aplicando desconto com objeto
		double precoFinal1 = p1.preco * (1 - Produto.desconto);
		double precoFinal2 = p2.preco * (1 - Produto.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
	}
}
