package atv3_simples;

public class ContaSimples extends Conta{
	

	//ATRIBUTOS
	private double saldoPoupanca;
	
	//CONSTRUTORES
	public ContaSimples() {
		
	}
	
	public ContaSimples(String banco, int agencia, int numerodaconta, double saldo) {
		super(banco, agencia, numerodaconta, saldo);
	}
	
	public ContaSimples(String banco, int agencia, int numerodaconta, double saldo, double saldoPoupanca) {
		super(banco, agencia, numerodaconta, saldoPoupanca);
		setSaldoPoupanca(saldoPoupanca);
	}
	
	//GETTERS E SETTERS
	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}
	public void setSaldoPoupanca(double saldoPoupanca) {
		if(saldoPoupanca != 0) {
			this.saldoPoupanca = saldoPoupanca;
		}
	}
	
	//METODOS
	public boolean depositoPoupanca(double valor) {
		if((valor != 0)&&(valor>0)) {
			setSaldoPoupanca(valor+getSaldoPoupanca());
			return true;
		} else {
			return false;
		}
	}
	
	public boolean saquePoupanca(double valor) {
		if(valor<=getSaldoPoupanca()) {
			setSaldoPoupanca(getSaldoPoupanca()-valor);
			return true;
		} else {
			return false;
		}
	}
	
	//TO_STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
