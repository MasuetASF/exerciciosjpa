package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String nome;
	
	private String email;
	
	
	public Usuario() {
	}


	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}


	public final Long getId() {
		return id;
	}


	public final void setId(Long id) {
		this.id = id;
	}


	public final String getNome() {
		return nome;
	}


	public final void setNome(String nome) {
		this.nome = nome;
	}


	public final String getEmail() {
		return email;
	}


	public final void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
