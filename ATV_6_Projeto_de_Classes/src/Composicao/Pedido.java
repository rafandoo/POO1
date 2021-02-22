package Composicao;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	//ATRIBUTOS
	private int num_movimento;
	private double valorT;
	
	private List<Itens> litens = new ArrayList<Itens>();
	
	//GETTERS E SETTERS
	public int getNum_movimento() {
		return num_movimento;
	}
	public void setNum_movimento(int num_movimento) {
		if(num_movimento > 0) {
			this.num_movimento = num_movimento;
		}
	}
	
	public double getValorT() {
		return valorT;
	}
	public void setValorT(double valorT) {
		if(valorT > 0) {
			this.valorT = valorT;
		}
	}
	
	//METODOS
	public boolean addItens(String descricao, int cod_prod) {
		Itens i = new Itens(descricao, cod_prod);
		return litens.add(i);
	}
	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [num_movimento=");
		builder.append(num_movimento);
		builder.append(", valorT=");
		builder.append(valorT);
		builder.append(", litens=");
		builder.append(litens);
		builder.append("]");
		return builder.toString();
	}
}
