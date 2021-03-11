 
public class FilaAtendimento {

	//CONSTRUTOR
	public FilaAtendimento(Atendimento a) {
		this.a = a;
		this.prox = null;
	}
	
	//ATRIBUTOS
	private Atendimento a;
	private FilaAtendimento prox;
	
	//GETTERS E SETTERS
	public Atendimento getA() {
		return a;
	}
	public void setA(Atendimento a) {
		this.a = a;
	}
	
	public FilaAtendimento getProx() {
		return prox;
	}
	public void setProx(FilaAtendimento prox) {
		this.prox = prox;
	}	
}
