package atv3_simples;

public class Conta {
	
	//ATRIBUTOS
	private String banco;
	private int agencia;
	private int numerodaconta;
	private double saldo;
	
	//CONSTRUTORES
	public Conta() {
		
	}
	
	//GETTERS E SETTERS
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		if(banco.length() > 0) {
			this.banco = banco;	
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia != 0) {
			this.agencia = agencia;
		}
	}
	
	public int getNumerodaconta() {
		return numerodaconta;
	}
	public void setNumerodaconta(int numerodaconta) {
		if(numerodaconta != 0) {
			this.numerodaconta = numerodaconta;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if(saldo != 0) {
			this.saldo = saldo;	
		}
	}

	//METODOS
	public boolean deposito(double valor) {
		if((valor != 0)&&(valor>0)) {
			setSaldo(valor+getSaldo());
			return true;
		} else {
			return false;
		}
	}
	
	public boolean saque(double valor) {
		if(valor<=getSaldo()) {
			setSaldo(getSaldo()-valor);
			return true;
		} else {
			return false;
		}
	}

	
	//TO_STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numerodaconta=");
		builder.append(numerodaconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}	
}
