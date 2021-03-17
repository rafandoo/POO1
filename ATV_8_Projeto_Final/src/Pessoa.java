
public abstract class Pessoa {
	
	//CONSTRUTORES
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
	}
	
	//ATRIBUTOS
	private String nome;
	private String cpf;
	
	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 0) {
			this.nome = nome;
		}
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf.length() > 0) {
			this.cpf = cpf;
		}
	}
}
