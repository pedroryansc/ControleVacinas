import java.time.LocalDate;

public class Administrador extends Cidadao {

	public Administrador(int numeroCNS, String nome, LocalDate dataNascimento, String cpf) {
		super(numeroCNS, nome, dataNascimento, cpf);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Administrador [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}