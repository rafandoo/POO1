package classes;

public class Lista_funcionarios {

	//ATRIBUTOS
	private Funcionario f;
	private Lista_funcionarios prox;
		
	//CONSTRUTOR
	public Lista_funcionarios(Funcionario f) {
		this.f = f;
		this.prox = null;
	}
		
	//GETTERS E SETTERS
	public Funcionario getF() {
		return f;
	}
	public void setF(Funcionario f) {
		this.f = f;
	}
		
	public Lista_funcionarios getProx() {
		return prox;
	}
	public void setProx(Lista_funcionarios prox) {
		this.prox = prox;
	}
}
