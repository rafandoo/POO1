
public class Lista_Medico {

	//CONSTRUTOR
	public Lista_Medico (Medico m) {
		this.m = m;
		this.prox = null;
	}
	
	//ATRIBUTOS
	private Medico m;
	private Lista_Medico prox;
	
	//GETTERS E SETTERS
	public Medico getM() {
		return m;
	}
	public void setM(Medico m) {
		this.m = m;
	}
	
	public Lista_Medico getProx() {
		return prox;
	}
	public void setProx(Lista_Medico prox) {
		this.prox = prox;
	}
}
