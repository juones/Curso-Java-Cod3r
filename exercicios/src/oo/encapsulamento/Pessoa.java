package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	// para evidar atribuições negativas no construtor
	// é possível utilizar o método alterarIdade
	// que possui a condição desejada
	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	// No eclipse, clicando com o direito
	// Source > Generate Getters and Setters...
	// É possível gerar um getter e um setter automaticamente para a variável desejada
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	//é possível ter dois getters em um método só
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}

	//Getter
	public int getIdade() {
		return idade;
	}

	//Setter
	public void setIdade(int novaIdade) {
		//math.abs transforma valores negativos em positivos
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	
	//também é possível setar um toString com os métodos
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Olá, eu sou o " + getNomeCompleto() + " e tenho " + getIdade() + " anos.";
	}

}
