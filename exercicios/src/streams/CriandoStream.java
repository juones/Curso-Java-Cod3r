package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
	
	public static void main(String[] args) {
		
		//nesse exemplo utilizamos muito method reference
		//nesse caso eu fiz uma referencia ao syso deixandoo mais curto
		Consumer<String> print = System.out::print;
		//Consumer<Integer> println = System.out::println;
		//stream.of é um método estático
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		//também é possível criar um stream a partir de um array
		String[] maisLangs = { "Python ", "Lisp " , "Perl ", "Go\n" };
		//aqui também é possível utilizar o stream.of
		Stream.of(maisLangs).forEach(print);
		
		//criar stream com a classe Arrays
		Arrays.stream(maisLangs).forEach(print);
		//também é possível delimitar o número de resultados que o stram vai me retornar
		//somente o Lisp nesse caso
		Arrays.stream(maisLangs, 1, 2).forEach(print);
		
		//também é possível gerar uma stream a partir das colections
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		
		//o Generate gera uma stream infinita
		//Stream.generate(() -> "a").forEach(print);
		// nesse caso também será gerado um stream infinito de forma ordenada
		//porém eu defino onde ele começa como no exemplo abaixo com inteiros
		//Stream.iterate(0, n -> n + 1).forEach(println);
	}

}
