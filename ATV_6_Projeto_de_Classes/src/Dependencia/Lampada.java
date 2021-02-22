package Dependencia;

public class Lampada {

	//ATRIBUTOS
	private float potencia;
	
	//GETTERS E SETTERS
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		if(potencia > 0) {
			this.potencia = potencia;
		}
	}
	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lampada [potencia=");
		builder.append(potencia);
		builder.append("]");
		return builder.toString();
	}

	
}
