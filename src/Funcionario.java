import java.time.LocalDate;

public class Funcionario extends Cidadao {

	private UnidadeSaude unidadeSaude;
	
	public Funcionario(int numeroCNS, String nome, LocalDate dataNascimento, String cpf, UnidadeSaude unidadeSaude) {
		super(numeroCNS, nome, dataNascimento, cpf);
		setUnidadeSaude(unidadeSaude);
	}
	
	public UnidadeSaude getUnidadeSaude() {
		return unidadeSaude;
	}
	public void setUnidadeSaude(UnidadeSaude unidadeSaude) {
		this.unidadeSaude = unidadeSaude;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [unidadeSaude=");
		builder.append(unidadeSaude);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}