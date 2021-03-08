
public class nodo {

	private Medico m;
	private nodo prox;
	
	public nodo (Medico m) {
		this.m = m;

		this.prox = null;
	}
	
	public Medico getM() {
		return m;
	}
	public void setM(Medico m) {
		this.m = m;
	}
	

	
	public nodo getProx() {
		return prox;
	}
	public void setProx(nodo prox) {
		this.prox = prox;
	}
	

}
