package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		
		//criar duas funcoes lambdas par fazer 2 filtros diferentes
		// depois usar o map no final

		VideoGame c1 = new VideoGame("Playstation 4", 2550, false);
		VideoGame c2 = new VideoGame("Nintendo Switch", 2850, true);
		VideoGame c3 = new VideoGame("Playstation Vita", 550, true);
		VideoGame c4 = new VideoGame("Xbox One", 2320, false);
		VideoGame c5 = new VideoGame("Playstation 5", 4600, false);
		VideoGame c6 = new VideoGame("PSP", 350, true);
		
		List<VideoGame> consoles = Arrays.asList(c1, c2, c3, c4, c5, c6);
		
		Predicate<VideoGame> portatil = c -> c.portatil == true;
		Function<VideoGame, String> saudacaoGame = s -> s.nome + " é um video game portátil e custa R$ " + s.preco;
		
		consoles.stream().filter(portatil).map(saudacaoGame).forEach(System.out::println);
	}

}
