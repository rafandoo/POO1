package Generalização;

public class Veiculo {

	//CONSTRUTOReS
	public Veiculo() {
		
	}
	
	public Veiculo(String marca, String modelo_ano) {
		setMarca(marca);
		setModelo_ano(modelo_ano);
	}
	
	//ATRIBUTOS
	private String marca;
	private String modelo_ano;
	
	//GETTERS E SETTERS
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if(marca.length() > 0) {
			this.marca = marca;
		}
	}
	
	public String getModelo_ano() {
		return modelo_ano;
	}
	public void setModelo_ano(String modelo_ano) {
		if(modelo_ano.length() > 0) {
			this.modelo_ano = modelo_ano;
		}
	}

	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo [marca=");
		builder.append(marca);
		builder.append(", modelo_ano=");
		builder.append(modelo_ano);
		builder.append("]");
		return builder.toString();
	}
	
	
}
