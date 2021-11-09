package classe;

import java.util.Date;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";
		
		//comparações incorretas entre objetos
		//esse tipo de comparação vai pelo endereço de memória e não pelo conteúdo
		System.out.println(u1 == u2);
		
		//para que esse equals de certo é necessário criar a função presente na classe Usuario.java
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		System.out.println(u2.equals(new Date()));
	}
} 
