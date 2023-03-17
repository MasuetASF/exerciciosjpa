package modelo.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Sobrinho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@ManyToMany(mappedBy = "sobrinhos")
	private List<Tio> tios = new ArrayList<>();
	
	
	public Sobrinho() {
		
	}
	

	public Sobrinho(String nome) {
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

	public final List<Tio> getTios() {
		return tios;
	}

	public final void setTios(List<Tio> tios) {
		this.tios = tios;
	} ;
	
	
	
}
