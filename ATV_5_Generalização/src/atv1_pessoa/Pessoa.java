package atv1_pessoa;

public class Pessoa {
	
	//CONSTRUTORES
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String endereco) {
		setNome(nome);
		setEndereco(endereco);
	}
	
	
	//ATRIBUTOS
	private String nome;
	private String endereco;
	
	//GETTERS E SETTERS
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if(endereco.length() > 0) {
			this.endereco = endereco;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 0) {
			this.nome = nome;
		}
	}
	
	
	//toSTRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
