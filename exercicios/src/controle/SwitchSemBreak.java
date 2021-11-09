package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		//Switch é diferente dos outros laços de repetição pois recebe o valor direfamente e não um boolean
		// Sem o break o código executa tudo o que está abaixo ( acumulativo )
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta": 
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei de nada");
		}
		System.out.println("Fim");
		
		
		// Outro exemplo onde o switch sem o break pode ser aplicado
		int idade = 0;
		switch (idade) {
		case 3:
			System.out.println("Sabe o que quer comer");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
		
	}

}
