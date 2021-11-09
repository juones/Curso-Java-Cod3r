package fundamentos.operadores;

public class DesafioAritimeticos {
	
	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		//para elevar um valor à terceita potencia (ao cubo) em java existe a classe Math power
		int b = (int) Math.pow(a,  3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		
		//desafio
		
		int divisor1 = 3 + 2;
		int resulDivisor1 = 6 * divisor1;
		int resulPotencia1 = (int) Math.pow(resulDivisor1, 2);
		int dividendo1 = 3 * 2;
		int resulDiv1 = resulPotencia1 / dividendo1;
		
		int divisor2a = 1 - 5;
		int divisor2b = 2 - 7;
		int resulDivisorb = divisor2a * divisor2b;
		int dividendo2 = 2;
		int resulDiv2 = resulDivisorb / dividendo2;
		int resulPotencia2 = (int) Math.pow(resulDiv2, 2);
		
		int resulDividendoFinal = resulDiv1 - resulPotencia2;
		int resulPotenciaDividendoPrinc = (int) Math.pow(resulDividendoFinal, 3);
		
		int resulPotencia3 = (int) Math.pow(10, 3);
		
		int resulFinal = resulPotenciaDividendoPrinc / resulPotencia3;
		
		System.out.println(resulFinal);

		//solução professor
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = ( 1 - 5 ) * ( 2 - 7 );
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("\n ");
		System.out.println("O resultado é :" + resultado);
		
		
		
	}

}
