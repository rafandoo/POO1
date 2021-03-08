
public class Lista_Paciente {

	private Paciente p;
	private Lista_Paciente prox;
	
	public Lista_Paciente(Paciente p) {
		this.p = p;
		this.prox = null;
	}
	
	public Paciente getP() {
		return p;
	}
	public void setP(Paciente p) {
		this.p = p;
	}
	
	public Lista_Paciente getProx() {
		return prox;
	}
	public void setProx(Lista_Paciente prox) {
		this.prox = prox;
	}
}
