package TODO;

public class Equipamentos {
	
	//CONSTRUTOR
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
	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Equipamentos [ferrameta=");
		builder.append(ferrameta);
		builder.append(", epi=");
		builder.append(epi);
		builder.append("]");
		return builder.toString();
	}
	
	
}
