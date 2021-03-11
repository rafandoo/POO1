
public class Controle_Atendimento {

	//CONSTRUTOR
	public Controle_Atendimento() {
		this.prim = null;
		this.ult = null;
	}
	
	//ATRIBUTOS
	private FilaAtendimento prim;
	private FilaAtendimento ult;
	
	//GETTERS E SETTERS
	public FilaAtendimento getPrim() {
		return prim;
	}
	public void setPrim(FilaAtendimento prim) {
		this.prim = prim;
	}
	
	public FilaAtendimento getUlt() {
		return ult;
	}
	public void setUlt(FilaAtendimento ult) {
		this.ult = ult;
	}
	
	//METODOS
	public void gera_atendimento(Atendimento a) { //INICIALIZA O ATENDIMENTO CONFORME A PRIORIDADE DO PACIENTE
		if(a.getPrioridade() == 1) {
			atend_emergencial(a);
		} else {
			atend_normal(a);
		}
	}
	
	public boolean ehvazio() { //CHECA SE A FILA ESTA VAZIA
		return (this.prim == null);
	}
	
	private void atend_emergencial(Atendimento a) { //PRIMEIROS DA FILA
		FilaAtendimento fa = new FilaAtendimento(a);
		if(this.ehvazio()) {
			this.ult = fa;
		}
		fa.setProx(this.prim);
		this.prim = fa;
	}
	
	private void atend_normal(Atendimento a) { //ULTIMOS DA FILA
		FilaAtendimento fa = new FilaAtendimento(a);
		if(this.ehvazio()) {
			this.prim = fa; 
		} else {
			this.ult.setProx(fa);
		}
		this.ult = fa;
	}
	
	public String imprimirFila() { //MOSTRA A FILA DE ATENDIMENTO
		String msg = "";
		if(this.ehvazio()) {
			msg="A lista está vazia!";
		} else {
			FilaAtendimento atual = this.prim;
			while(atual != null) {
				msg += "Nome/Prioridade: " + atual.getA().getPaciente_asr() +" | "+
						atual.getA().getPrioridade() + " <- ";
				atual = atual.getProx();
			}
		}
		return msg;
	}
		
	public void removePrim() { //ATENDE O PRIMEIRO PACIENTE
		removeFila(getPrim().getA().getPaciente_asr());
	}

	public boolean removeFila(String nome) {
		FilaAtendimento atual = this.prim;
		FilaAtendimento ant = null;
		if(this.ehvazio()) {
			return false;
		} else {
			while((atual != null) && (!atual.getA().getPaciente_asr().equals(nome))) {
				ant = atual;
				atual = atual.getProx();
			}
			if(atual == this.prim) {
				if(this.prim == this.ult) {
					this.ult = null;
				}
				this.prim = this.prim.getProx();
			} else {
				if(atual == this.ult) {
					this.ult = ant;
				}
				ant.setProx(atual.getProx());
			}
			return true;
		}
	}
}
