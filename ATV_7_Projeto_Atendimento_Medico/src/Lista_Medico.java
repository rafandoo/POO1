
public class Lista_Medico {

	private Medico m;
	private Lista_Medico prox;
	
	public Lista_Medico (Medico m) {
		this.m = m;
		this.prox = null;
	}
	
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
