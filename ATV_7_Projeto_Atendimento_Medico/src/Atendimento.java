
public class Atendimento {

	public Atendimento() {
		this.prim_med = null;
		this.ult_med = null;
	}
	//ATRIBUTOS
	private int prioridade;
	
	private Lista_Medico prim_med;
	private Lista_Medico ult_med;
	
	//GET E SET
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		if(prioridade >= 0) {
			this.prioridade = prioridade;
		}
	}
	
	public Lista_Medico getPrim() {
		return prim_med;
	}
	public void setPrim(Lista_Medico prim) {
		this.prim_med = prim;
	}
	
	public Lista_Medico getUlt() {
		return ult_med;
	}
	public void setUlt(Lista_Medico ult) {
		this.ult_med = ult;
	}
	
	
	
	//METODOS
	public void def_prioridade(int r1, int r2, int r3, int r4) {
		int tt = 0;
		if(r1 == 1) {
			tt++;
		}
		if(r2 == 1) {
			tt++;
		}
		if(r3 == 1) {
			tt++;
		}
		if(r4 == 1) {
			tt++;
		}
		
		if(tt == 4) {
			setPrioridade(1);
		} else if(tt == 3) {
			setPrioridade(2);
		} else if(tt ==2) {
			setPrioridade(3);
		} else if(tt == 1 || tt == 0) {
			setPrioridade(4);
		}
	
		
	}
	

	public boolean ehvazio_medico() {
		return (this.prim_med == null);
	}
	
	public void inserirMedico(Medico m) {
		Lista_Medico nv = new Lista_Medico(m);
		if(this.ehvazio_medico()) {
			this.ult_med = nv;
		}
		nv.setProx(this.prim_med);
		this.prim_med = nv;
	}
	
	public String imprimir() {

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
	
}
