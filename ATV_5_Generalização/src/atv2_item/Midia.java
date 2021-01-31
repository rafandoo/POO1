package atv2_item;

public class Midia extends Item{
	
	//ATRIBUTOS
	private String gravadora;
	private float duracao;
	
	//CONSTRUTORES
	public Midia() {
		
	}
	
	public Midia(int codigo, String descricao) {
		super(codigo, descricao);
	}
	
	public Midia(int codigo, String descricao, String gravadora, float duracao) {
		super(codigo, descricao);
		setGravadora(gravadora);
		setDuracao(duracao);
	}
	
	//GETTERS E SETTERS
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		if(gravadora.length() > 0) {
			this.gravadora = gravadora;
		}
	}
	
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {
		if(duracao != 0.00f) {
			this.duracao = duracao;
		}
	}

	
	//TO_STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Midia [gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
