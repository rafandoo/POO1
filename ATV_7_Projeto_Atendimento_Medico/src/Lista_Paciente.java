
public class Lista_Paciente {

	//CONSTRUTOR
	public Lista_Paciente(Paciente p) {
		this.p = p;
		this.prox = null;
	}
	
	//ATRIBUTOS
	private Paciente p;
	private Lista_Paciente prox;
	
	//GETTERS E SETTERS
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
