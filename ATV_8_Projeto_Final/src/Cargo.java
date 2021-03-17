
public class Cargo {

	//ATRIBUTOS
	private String funcao;
	private Setor s;
	
	//CONSTRUTORES
	public Cargo() {
		super();
	}
	
	public Cargo(String funcao) {
		setFuncao(funcao);
	}
	
	public Cargo(String funcao, Setor s) {
		setFuncao(funcao);
		setS(s);  
	}
	
	//GETTERS E SETTERS
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		if(funcao.length() > 0) {
			this.funcao = funcao;
		}
	}
	
	public void setS(Setor s) {
		this.s = s;
	}
	public Setor getS() {
		return s;
	}
	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cargo [Função: ");
		builder.append(funcao);
		builder.append(", setor: ");
		builder.append(s.getCod() + " - " + s.toString());
		builder.append("]");
		return builder.toString();
	}
}
