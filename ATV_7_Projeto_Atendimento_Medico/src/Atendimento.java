
public class Atendimento {
	
	//CONSTRUTOR
	public Atendimento() {
		this.prim = null;
		this.ult = null;		
	}
	
	//ATRIBUTOS
	private int prioridade;
	private String pac;
	
	
	private FilaAtendimento prim;
	private FilaAtendimento ult;
	

	//GETTERS E SETTERS
 	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	public String getPac() {
		return pac;
	}
	public void setPac(String pac) {
		this.pac = pac;
	}
	
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
	
	
	public void normal(Atendimento a) {
		FilaAtendimento fa = new FilaAtendimento(a);
		if(this.ehvazio()) {
			this.ult = fa;
		}
		fa.setProx(this.prim);
		this.prim = fa;
	}
	
	public void emergencial(Atendimento a) {
		FilaAtendimento fa = new FilaAtendimento(a);
		if(this.ehvazio()) {
			this.prim = fa; 
		} else {
			this.ult.setProx(fa);
		}
		this.ult = fa;
	}
	
	public String imprimirFila() {
		String msg = "";
		if(this.ehvazio()) {
			msg="A lista está vazia!";
		} else {
			FilaAtendimento atual = this.prim;
			while(atual != null) {
				msg += atual.getA().getPac() + " -> ";
				atual = atual.getProx();
			}
		}
		return msg;
	}
}
