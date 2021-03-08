import java.util.ArrayList;
import java.util.List;


public class Atendimento {

	public Atendimento() {
		this.prim = null;
		this.ult = null;
	}
	//ATRIBUTOS
	private int prioridade;
	
	private nodo prim;
	private nodo ult;
	
	//GET E SET
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		if(prioridade >= 0) {
			this.prioridade = prioridade;
		}
	}
	
	public nodo getPrim() {
		return prim;
	}
	public void setPrim(nodo prim) {
		this.prim = prim;
	}
	
	public nodo getUlt() {
		return ult;
	}
	public void setUlt(nodo ult) {
		this.ult = ult;
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
	

	public boolean ehvazio() {
		return (this.prim == null);
	}
	
	public void inserirPrim(Medico m) {
		nodo nv = new nodo(m);
		if(this.ehvazio()) {
			this.ult = nv;
		}
		nv.setProx(this.prim);
		this.prim = nv;
	}
	
	public String imprimir() {

		String msg = "";
		if(this.ehvazio()) {
			msg="A lista está vazia!";
		} else {
			nodo atual = this.prim;
			while(atual != null) {

				msg += atual.getM().getNome()+ " | " +atual.getM().getCRM() +" -> ";
				atual = atual.getProx();
			}
		}

		return msg;
	}
	
}
