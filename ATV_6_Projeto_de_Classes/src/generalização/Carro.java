package generalização;

public class Carro extends Veiculo {
	
	//CONSTRUTORES
		public Carro() {
			
		}
		
		public Carro(String marca, String modelo_ano, float potencia_CC, int chassis) {
			super(marca, modelo_ano);
			setPotencia(potencia_CC);
			setChassis(chassis);
		}
		
		//ATRIBUTOS
		private float potencia_CC;
		private int chassis;
		
		//GETTERS E SETTERS
		public float getPotencia() {
			return potencia_CC;
		}
		public void setPotencia(float potencia_CC) {
			if(potencia_CC > 0) {
				this.potencia_CC = potencia_CC;
			}
		}
		
		public int getChassis() {
			return chassis;
		}
		public void setChassis(int chassis) {
			if(chassis > 0) {
				this.chassis = chassis;
			}
		}
		
		//TO STRING
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Carro [potencia_CC=");
			builder.append(potencia_CC);
			builder.append(", chassis=");
			builder.append(chassis);
			builder.append(", toString()=");
			builder.append(super.toString());
			builder.append("]");
			return builder.toString();
		}

}