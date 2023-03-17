package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno {

	private double valorBolsa;
	
	public AlunoBolsista() {

	}

	public AlunoBolsista(Long matricula, String nome, double valorBolsa) {
		super(matricula, nome);
		this.valorBolsa = valorBolsa;
	}

	public final double getValorBolsa() {
		return valorBolsa;
	}

	public final void setValorBolsa(double valorBolsa) {
		this.valorBolsa = valorBolsa;
	}
	
	
}
