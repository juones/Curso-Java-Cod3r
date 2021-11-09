package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
		
		//é possível utilizar um generics dentro do outro
		Supplier<List<String>> umaLista = 
				//como supplier não recebo nenhum parametro de entrada é necessário utilizar os ()
				() -> Arrays.asList("Ana", "Bia", "Lia", "Liz");
				
		//com supplier se utiliza o .get		
		System.out.println(umaLista.get());
		
		//supplier não utiliza composição
		
	}

}
