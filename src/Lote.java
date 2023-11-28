public class Lote {
	
	private String codigo;
	private String nomeVacina;
	private String laboratorio;
	
	public Lote(String codigo, String nomeVacina, String laboratorio) {
		setCodigo(codigo);
		setNomeVacina(nomeVacina);
		setLaboratorio(laboratorio);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNomeVacina() {
		return nomeVacina;
	}
	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lote [codigo=");
		builder.append(codigo);
		builder.append(", nomeVacina=");
		builder.append(nomeVacina);
		builder.append(", laboratorio=");
		builder.append(laboratorio);
		builder.append("]");
		return builder.toString();
	}
}