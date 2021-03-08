
public class Atendimento {

	//ATRIBUTOS
	private int prioridade;
	
	//GET E SET
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		if(prioridade >= 0) {
			this.prioridade = prioridade;
		}
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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento [prioridade=");
		builder.append(prioridade);
		builder.append("]");
		return builder.toString();
	}
	
	
}
