package dependencia;

public class Interruptor {
	
	//ATRIBUTOS
	private String estado;
	
	//GETTERS E SETTERS
	public String getEstado() {
		return estado;
	}
	private void setEstado(String estado) {
		if(estado.length() > 0) {
			this.estado = estado;
		}
	}
	
	//METODOS
	public void ligarInterp(Lampada lamp) {
		setEstado("ligado");
		lamp.toString();
	}
	
	public void desligarInterp(Lampada lamp) {
		setEstado("desligado");
	}
	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Interruptor [estado=");
		builder.append(estado);
		builder.append("]");
		return builder.toString();
	}
		
}
