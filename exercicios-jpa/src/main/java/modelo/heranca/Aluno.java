package modelo.heranca;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("AL")
public class Aluno {

	@Id
	private Long matricula;
	
	private String nome;
	
	public Aluno() {
		
	}

	public Aluno(Long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public final Long getMatricula() {
		return matricula;
	}

	public final void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

