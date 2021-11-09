package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //estou dizendo que essa classe está mapeada para uma entidade do banco
public class Usuario {
	
	@Id //minha primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //indica auto incremento não compartilhado com outras entidades
	private Long id;
	
	private String nome;
	private String email;
	
	public Usuario() {
		
	}
	
	//não recebo id pois ele será auto incremento
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
