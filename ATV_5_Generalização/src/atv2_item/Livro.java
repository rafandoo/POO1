package atv2_item;

public class Livro extends Item{
	 
	//ATRIBUTOS
	private String autor;

	//CONSTRUTORES
	public Livro() {
		
	}
	
	public Livro(int codigo, String descricao) {
		super(codigo, descricao);
	}
	
	public Livro(int codigo, String descricao, String autor) {
		super(codigo, descricao);
		setAutor(autor);
	}
	
	//GETTERS E SETTERS
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		if(autor.length() > 0) {
			this.autor = autor;
		}
	}
	
	//TO_STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [autor=");
		builder.append(autor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
