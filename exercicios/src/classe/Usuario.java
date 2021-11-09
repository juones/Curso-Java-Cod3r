package classe;

public class Usuario {
	
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		//Para evitar erros é possível validar se o objeto comparado está instanceado da mesma classe
		if(objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}
	
	// O hashcode será abordado em outra aula
	// Para facilitar a estrutura, basta clicar com o direito > source > Generate hashCode() and equals()
	
	public int hashcode() {
		return 0;
	}
}
