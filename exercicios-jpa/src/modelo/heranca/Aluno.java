package modelo.heranca;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity

//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //cria todos os atributos em uma tabela so

@Inheritance(strategy = InheritanceType.JOINED)// cria duas tabelas ao invés de uma só
@DiscriminatorColumn(name= "tipo", length = 2, discriminatorType = DiscriminatorType.STRING) //descriminador de colunas
@DiscriminatorValue("AL") //necessário discriminar o valor em ambas as classes


//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) //para cada classe concreta eu vou ter uma tabela
public class Aluno {
	
	@Id
	private Long matricula;
	
	private String nome;
	
	public Aluno() {}

	public Aluno(Long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
