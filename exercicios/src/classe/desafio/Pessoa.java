//Pessoa.java
package classe.desafio;

public class Pessoa {
	
	String nomePessoa = "";
	double pesoPessoa = 0.0;
	
	Pessoa(String nomePessoa, double pesoPessoa){
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	
	//retorna como parametro o objeto comida da classe Comida
	void comer (Comida comida) {
		if(comida != null) {
			this.pesoPessoa += comida.pesoComida;
		}
	}
	
	String apresentar() {
		return "Olá eu me chamo " + nomePessoa + " e tenho " + pesoPessoa + " Kgs.";
	}
	
	void apresentarFinal() {
		System.out.println("Olá eu me chamo " + nomePessoa + " e agora tenho " + pesoPessoa + " Kgs.");
	}

}
