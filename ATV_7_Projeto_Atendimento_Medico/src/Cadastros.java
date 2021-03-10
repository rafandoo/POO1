
public class Cadastros {

	public Cadastros() {
		this.prim_med = null;
		this.ult_med = null;
		
		this.prim_pac = null;
		this.ult_pac = null;
	}
	//ATRIBUTOS
	private Lista_Medico prim_med;
	private Lista_Medico ult_med;
	
	private Lista_Paciente prim_pac;
	private Lista_Paciente ult_pac;
	
	//GETTERS E SETTERS
	
	public Lista_Medico getPrim_med() {
		return prim_med;
	}
	public void setPrim_med(Lista_Medico prim) {
		this.prim_med = prim;
	}
	
	public Lista_Medico getUlt() {
		return ult_med;
	}
	public void setUlt(Lista_Medico ult) {
		this.ult_med = ult;
	}
	
	public Lista_Paciente getPrim_pac() {
		return prim_pac;
	}
	public void setPrim_pac(Lista_Paciente prim_pac) {
		this.prim_pac = prim_pac;
	}
	
	public Lista_Paciente getUlt_pac() {
		return ult_pac;
	}
	public void setUlt_pac(Lista_Paciente ult_pac) {
		this.ult_pac = ult_pac;
	}
	
	//METODOS
	public boolean ehvazio_medico() {
		return (this.prim_med == null);
	}
	
	public void inserirMedico(Medico m) {
		Lista_Medico lm = new Lista_Medico(m);
		if(this.ehvazio_medico()) {
			this.ult_med = lm;
		}
		lm.setProx(this.prim_med);
		this.prim_med = lm;
	}
	
	public boolean ehvazio_paciente() {
		return (this.prim_med == null);
	}
	
	public void inserirPaciente(Paciente p) {
		Lista_Paciente lp = new Lista_Paciente(p);
		if(this.ehvazio_paciente()) {
			this.ult_pac = lp;
		}
		lp.setProx(this.prim_pac);
		this.prim_pac = lp;
	}
		
	public String imprimirMed() {
		String msg = "";
		if(this.ehvazio_medico()) {
			msg="A lista está vazia!";
		} else {
			Lista_Medico atual = this.prim_med;
			while(atual != null) {
				msg += atual.getM().getNome()+ " | " +atual.getM().getCRM() +" -> ";
				atual = atual.getProx();
			}
		}
		return msg;
	}
	
	public String imprimirPac() {
		String msg = "";
		if(this.ehvazio_paciente()) {
			msg = "A lista está vazia!";
		} else {
			Lista_Paciente atual = this.prim_pac;
			while(atual != null) {
				msg += atual.getP().getNome()+ " | " +atual.getP().getCod_paciente() +" -> ";
				atual = atual.getProx();
			}
		}
		return msg;
	}
	
}
