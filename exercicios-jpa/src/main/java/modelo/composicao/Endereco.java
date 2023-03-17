package modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	private String logradouro;
	private String complemento;
	public final String getLogradouro() {
		return logradouro;
	}
	public final void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public final String getComplemento() {
		return complemento;
	}
	public final void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
}
