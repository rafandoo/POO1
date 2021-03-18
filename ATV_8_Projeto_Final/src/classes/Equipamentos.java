package classes;

public class Equipamentos {
	
	//CONSTRUTORES
	public Equipamentos() {
		setFerrameta("");
		setEpi("");
	}
	
	public Equipamentos(String ferramenta, String epi) {
		setFerrameta(ferramenta);
		setEpi(epi);
	}
	
	//ATRIBUTOS
	private String ferrameta;
	private String epi;
	
	//GETTERS E SETTERS
	public String getFerrameta() {
		return ferrameta;
	}
	public void setFerrameta(String ferrameta) {
		if(ferrameta.length() > 0) {
			this.ferrameta = ferrameta;
		}
	}
	
	public String getEpi() {
		return epi;
	}
	public void setEpi(String epi) {
		if(epi.length() > 0) {
			this.epi = epi;
		}
	}
	
	//TO_.STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Equipamentos [Ferrameta: ");
		builder.append(ferrameta);
		builder.append(", EPI: ");
		builder.append(epi);
		builder.append("]");
		return builder.toString();
	}
}
