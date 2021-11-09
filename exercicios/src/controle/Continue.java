package controle;

public class Continue {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			//mostra somente valores pares
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);			
		}
		
		System.out.println();
		//nesse caso com o continue ele não vai me trazer o valor de 5
		for (int i = 0; i <= 10; i++) {
			if(i == 5) continue;
			System.out.println(i);
		}
	}

}
