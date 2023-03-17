package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "prod_nome", length = 200, nullable = false)
	private String nome;
	
	@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)
	private Double preco;
	
	//Construtor Padrão
	public Produto() {
	
	}
	
	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
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
	public final Double getPreco() {
		return preco;
	}
	public final void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
}
