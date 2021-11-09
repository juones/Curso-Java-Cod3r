package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
	
	public static void main(String[] args) {
		
		//mostrar todos os produtos com desconto maior que 30% e frete gratis
		//produto com preco nome desconto e frete
		
		Produto p1 = new Produto("iPhone", 4500, 0.2, 0);
		Produto p2 = new Produto("Airpods", 850, 0.3, 0);
		Produto p3 = new Produto("iPad", 2650, 0.15, 0);
		Produto p4 = new Produto("Macbook Pro", 15588, 0.29, 0);
		Produto p5 = new Produto("Beats Solo", 655, 0.5, 0);
		Produto p6 = new Produto("Carregador", 230, 0.3, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Produto> descontao = p -> p.desconto >= 0.3;
		Predicate<Produto> freteGratis = f -> f.frete == 0;
		Function<Produto, String> saudacaoProduto = s -> s.nome + " custa R$ " + s.preco + " e está com " + s.desconto + "% de desconto e está com frete grátis!";
		
		produtos.stream()
				.filter(descontao)
				.filter(freteGratis)
				.map(saudacaoProduto)
				.forEach(System.out::println);
	}

}
