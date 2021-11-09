package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		//posso converter um inteiro para string usando o Wrapper
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		
		// ou posso convertar um int com o wraper dentro do system out
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		//não muito recomendado mas também é possivel converter com a concatenação das variáveis com uma string vazia
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
	}

}
