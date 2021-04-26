package agregacao;

public class Componentes {
	
	//CONSTRUTOR
	public Componentes(String processador, String ram) {
		setProcessador(processador);
		setRam(ram);
	}
	
	//ATRIBUTOS
	private String processador;
	private String ram;
	
	//GETTERS E SETTERS
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		if(processador.length() > 0) {
			this.processador = processador;
		}
	}
	
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		if(ram.length() > 0) {
			this.ram = ram;
		}
	}
	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Componentes [processador=");
		builder.append(processador);
		builder.append(", ram=");
		builder.append(ram);
		builder.append("]");
		return builder.toString();
	}
	
}
