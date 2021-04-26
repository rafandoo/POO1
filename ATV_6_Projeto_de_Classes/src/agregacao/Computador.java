package agregacao;

import java.util.ArrayList;
import java.util.List;

public class Computador {

	//ATRIBUTOS
	private String modelo;
	
	private List<Componentes> lcomp = new ArrayList<Componentes>();
	
	//GETTERS E SETTERS
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if(modelo.length() > 0) {
			this.modelo = modelo;
		}
	}
	
	//METODOS
	public boolean addComponente(Componentes comp) {
		return lcomp.add(comp);
	}
	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [modelo=");
		builder.append(modelo);
		builder.append("]");
		for (Componentes componentes : lcomp) {
			builder.append(componentes.toString());
		}
		return builder.toString();
	}

}
