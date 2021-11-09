package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> prod.preco >= 750;
		Predicate<Produto> isCaroComDesconto = prod -> (prod.preco * (1- prod.desconto)) >= 750;
		Predicate<Produto> temDesconto = prod -> prod.desconto >= 0.1;
		
		Produto produto = new Produto("Notebook", 3893.89, 0.90);
		Produto produto1 = new Produto("Playstation 5", 4600.89, 0.09);
		
		//no predicate sempre devemos chamar o test
		System.out.println(isCaro.test(produto));
		System.out.println(isCaroComDesconto.test(produto));
		System.out.println(temDesconto.test(produto));
		System.out.println(temDesconto.test(produto1));
	}

}
