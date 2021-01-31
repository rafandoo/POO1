package atv3_simples;

public class ContaEspecial extends Conta{
	
	//ATRIBUTOS
	private int diasSemJuros;
	private double limite;
	
	//CONSTRUTORES
	public ContaEspecial() {
		
	}
	
	public ContaEspecial(String banco, int agencia, int numerodaconta, double saldo) {
		super(banco, agencia, numerodaconta, saldo);
	}
	
	public ContaEspecial(String banco, int agencia, int numerodaconta, double saldo, int diasSemJuros, double limite) {
		super(banco, agencia, numerodaconta, saldo);
		setDiasSemJuros(diasSemJuros);
		setLimite(limite);
	}
	
	//GETTERS E SETTERS
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	public void setDiasSemJuros(int diasSemJuros) {
		if(diasSemJuros != 0) {
			this.diasSemJuros = diasSemJuros;	
		}
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		if(limite != 0) {
			this.limite = limite;
		}
	}

	
	//TO_STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
