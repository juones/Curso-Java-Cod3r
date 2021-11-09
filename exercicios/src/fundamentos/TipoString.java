package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		//ou
		System.out.println(s + "!!!");
		//mostra em booleam se a string inicia com o valor apresentado
		System.out.println(s.startsWith("Boa"));
		
		//termina com
		System.out.println(s.endsWith("tarde"));
		
		System.out.println(s.length());
		
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade : " + idade + "\nSalário: " + salario);
		
		
		/* com printf cada %s significa uma variável que será impressa, 
		 * %d para valores numericos inteiros
		 * %f para valores numéricos reais
		 * %2.f para definir a quantidade de casas decimeis quero mostrar
		 */
	
		System.out.printf("O senhor: %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		//ou
		String frase = String.format("\nO senhor: %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		
		
	}

}
