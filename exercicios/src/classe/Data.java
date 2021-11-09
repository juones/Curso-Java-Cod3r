//Data.java
package classe;

public class Data {
	//dentro da classe data criar 3 atributos, dia, mes e ano
	//DadaTeste recebe o método main que serão instanciadas duas datas
	//desafio método
	
	//Desafio construtor
	// criar construtor padrão e definir construtor que define dia mes e ano
	// data default para o construtor padrão 01/01/1970
	
	int dia;
	int mes;
	int ano;
	
	Data (){
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		//também é possível utilizar o this pata chamar um construtor dentro de outro construtor
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano){
		//nesse caso estou alterando o valor da variável de instancia declarada na linha 13
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		// Variável não poderá ser utilizada antes da sua linha de definição e estará limitada ao escopo do método
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);	
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
