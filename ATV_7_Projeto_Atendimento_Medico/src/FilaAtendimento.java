
public class FilaAtendimento {

	private Atendimento a;
	private FilaAtendimento prox;
	
	public FilaAtendimento(Atendimento a) {
		this.a = a;
		this.prox = null;
	}
	
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
