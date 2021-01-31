package atv2_item;

public class Item {

	//ATRIBUTOS
	private int codigo;
	private String descricao;
	
	//CONSTRUTORES
	public Item() {
		
	}
	
	public Item(int codigo, String descricao) {
		setCodigo(codigo);
		setDescricao(descricao);
	}
	
	//GETTERS E SETTERS
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if(codigo != 0) {
			this.codigo = codigo;
		}
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if(descricao.length() > 0) {
			this.descricao = descricao;
		}
	}

	
	//TO_STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}
}
