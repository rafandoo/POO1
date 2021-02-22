package TODO;

public class Cargo {

	//ATRIBUTOS
	private String funcao;
	
	//GETTERS E SETTERS
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		if(funcao.length() > 0) {
			this.funcao = funcao;
		}
	}
	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cargo [funcao=");
		builder.append(funcao);
		builder.append("]");
		return builder.toString();
	}
	
	
}
