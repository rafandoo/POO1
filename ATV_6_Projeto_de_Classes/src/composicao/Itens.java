package composicao;

public class Itens {
	
	//CONSTRUTOR
	public Itens(String descricao, int cod_prod) {
		setDescricao(descricao);
		setCod_prod(cod_prod);
	}
	
	//ATRIBUTOS
	private String descricao;
	private int cod_prod;
	
	//GETTERS E SETTERS
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getCod_prod() {
		return cod_prod;
	}
	public void setCod_prod(int cod_prod) {
		this.cod_prod = cod_prod;
	}

	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Itens [descricao=");
		builder.append(descricao);
		builder.append(", cod_prod=");
		builder.append(cod_prod);
		builder.append("]");
		return builder.toString();
	}
	
	
}
