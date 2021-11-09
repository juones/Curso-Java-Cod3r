//DataTeste.vava
package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data(19, 11, 2020);
		
		Data d2 = new Data();
		d2.dia = 20;
		d2.mes = 11;
		d2.ano = 2020;
		
		var d3 = new Data();
		
		//String dataFormatadaTeste = d3.obterDataFormatada();
		
		System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
		System.out.printf("\n%d/%d/%d", d2.dia, d2.mes, d2.ano);
		
		System.out.println("\n Resultado do desafio método: ");
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		d3.imprimirDataFormatada();
		
	}

}
