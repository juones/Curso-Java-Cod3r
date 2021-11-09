package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		//informações do funcionário
		
		//numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		//também é possível separar os números com undeline
		//Na declaração literal, quando o valor é muito alto, para que o sistema reconheça o número como long, é necessário adicionar um L ao final do número.
		long pontosAcumulados = 3_234_845_223L;
		
		//numéricos reais
		// nesse exemplo como é uma reclaração literal de um número maior do que o suportado, devo adicionar a letra F ao final do número
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//boolean
		boolean estaDeFerias = false; //true
		
		//caractere
		char status = 'A'; //Ativo
		
		
		// ANTES DE SEREM UTILIZADAS, AS VARIÁVEIS FICAM DESTACADAS PARA SEREM REMOVIDAS POIS NÃO TIVERAM USO NO CÓDIGO
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//Usando a variável id
		System.out.println(id + ": ganha -> " + salario);
		
		// Está de férias?
		System.out.println("Férias? " + estaDeFerias);
		
		// qual é o status 
		System.out.println("Status: " + status);
		
	
	}

}
