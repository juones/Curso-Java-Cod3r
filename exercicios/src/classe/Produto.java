//produto.java

package classe;

public class Produto {
	
	//criando a primeira classe Produto sem o método main
	// A classe ProdutoTeste recebe main
	
	//As variáveis podem ser definitas sem atributos
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(){
	}
	
	Produto (String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	

	//não é necessário receber parâmetro no método pois eles já existem no objeto
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
	
	//tmbém é possível gerar um novo método com um parametro adicional, na chamada ele será diferenciado ateavés do parametro
	double precoComDesconto (double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}

}
