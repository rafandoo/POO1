package Generalização;

public class Moto extends Veiculo{

	//CONSTRUTORES
	public Moto() {
		
	}
	
	public Moto(String marca, String modelo_ano, float potencia) {
		super(marca, modelo_ano);
		setPotencia(potencia);
	}
	
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
		builder.append("Moto [potencia=");
		builder.append(potencia);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
