public class UnidadeSaude {

	private String nome;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	
	public UnidadeSaude(String nome, String rua, String bairro, String cidade, String estado) {
		setNome(nome);
		setRua(rua);
		setBairro(bairro);
		setCidade(cidade);
		setEstado(estado);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UnidadeSaude [nome=");
		builder.append(nome);
		builder.append(", rua=");
		builder.append(rua);
		builder.append(", bairro=");
		builder.append(bairro);
		builder.append(", cidade=");
		builder.append(cidade);
		builder.append(", estado=");
		builder.append(estado);
		builder.append("]");
		return builder.toString();
	}
}