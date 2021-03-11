
public class Cadastros {

	//CONSTRUTOR
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
	public boolean ehvazio_medico() { //CHECA SE A FILA ESTA VAZIA
		return (this.prim_med == null);
	}
	
	public void inserirMedico(Medico m) { //CADASTRA UM MEDICO
		Lista_Medico lm = new Lista_Medico(m);
		if(this.ehvazio_medico()) {
			this.ult_med = lm;
		}
		lm.setProx(this.prim_med);
		this.prim_med = lm;
	}

	public String pesquisaMedico(String CRM) { //PESQUISA UM MEDICO
		Lista_Medico atual = this.prim_med;
		while((atual != null) && (!atual.getM().getCRM().equals(CRM))) {
			atual = atual.getProx();
		}
		return (atual.getM().getNome()); //RETORNA O VALOR DA MESA
	}
	
	public boolean ehvazio_paciente() { //CHECA SE A FILA ESTA VAZIA
		return (this.prim_pac == null);
	}
	
	public void inserirPaciente(Paciente p) { //CADASTRA UM PACIENTE
		Lista_Paciente lp = new Lista_Paciente(p);
		if(this.ehvazio_paciente()) {
			this.ult_pac = lp;
		}
		lp.setProx(this.prim_pac);
		this.prim_pac = lp;
	}

	public String pesquisaPaciente(String nome) { //PESQUISA UM PACIENTE
		Lista_Paciente atual = this.prim_pac;
		while((atual != null) && (!atual.getP().getNome().equals(nome))) {
			atual = atual.getProx();
		}
		return (atual.getP().getNome()); //RETORNA O VALOR DA MESA
	}
	
	public String imprimirMed() { //MOSTRA A LISTA DE MEDICOS CADASTRADOS
		String msg = "";
		if(this.ehvazio_medico()) {
			msg = "A lista está vazia!";
		} else {
			Lista_Medico atual = this.prim_med;
			while(atual != null) {
				msg += "Nome: " + atual.getM().getNome()+ " | CRM: " +atual.getM().getCRM() +"\n";
				atual = atual.getProx();
			}
		}
		return msg;
	}
	
	public String imprimirPac() { //MOSTRA A LISTA DE PACIENTES CADASTRADOS
		String msg = "";
		if(this.ehvazio_paciente()) {
			msg = "A lista está vazia!";
		} else {
			Lista_Paciente atual = this.prim_pac;
			while(atual != null) {
				msg += atual.getP().getNome()+ " | " +atual.getP().getCod_paciente() +"\n";
				atual = atual.getProx();
			}
		}
		return msg;
	}	
}
