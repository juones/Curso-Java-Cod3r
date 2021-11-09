package controle;

public class Break {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if(i == 5) {
				break; //independente do for ir até < 10 o break para o laço
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("Fim");
	}

}
