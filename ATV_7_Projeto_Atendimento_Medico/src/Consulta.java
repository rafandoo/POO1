import java.util.Date;

public class Consulta extends Cadastros {

	//CONSTRUTOR
	public Consulta() {
		this.fim = null;
		this.inicio = null;
	}
	//ATRIBUTOS
	private Date inicio;
	private Date fim;
	
	//GETTERS E SETTERS
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	
	public Date getFim() {
		return fim;
	}

	public void setFim(int fim) {
		this.fim.setTime(fim);

	}
	
	//METODOS 
	public Date tempo_atend() {
		return fim;
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Consulta [inicio=");
		builder.append(inicio);
		builder.append(", fim=");
		builder.append(fim);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
