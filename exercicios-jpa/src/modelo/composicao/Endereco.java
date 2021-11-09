package modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable //significa qua não tenho uma tabela especifica como se fosse uma entidade
// significar que os dados serão colocados nas entidades que o utilizam
public class Endereco {
	
	private String logradouro;
	private String complemento;
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
