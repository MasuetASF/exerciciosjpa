package modelo.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "atores")
public class Ator {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@ManyToMany(mappedBy = "atores", cascade = CascadeType.PERSIST )
	private List<Filme> filmes = new ArrayList<>();
	
	public Ator() {
		// TODO Auto-generated constructor stub
	}

	public Ator(String nome) {
		super();
		this.nome = nome;
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

	public final List<Filme> getFilmes() {
		return filmes;
	}

	public final void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	
}
