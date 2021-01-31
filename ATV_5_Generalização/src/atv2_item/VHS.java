package atv2_item;

public class VHS extends Midia{

	//ATRIBUTOS
	private String titulo;
	
	//CONSTRUTORES
	public VHS() {
		
	}

	public VHS(int codigo, String descricao) {
		super(codigo, descricao);
	}
	
	public VHS(int codigo, String descricao, String gravadora, float duracao) {
		super(codigo, descricao, gravadora, duracao);
	}
	
	public VHS(int codigo, String descricao, String gravadora, float duracao, String titulo) {
		super(codigo, descricao, gravadora, duracao);
		setTitulo(titulo);
	}
	
	//GETTERS E SETTERS
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if(titulo.length() > 0) {
			this.titulo = titulo;
		}
	}

	//TO_STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VHS [titulo=");
		builder.append(titulo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
