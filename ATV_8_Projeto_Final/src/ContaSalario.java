
public class ContaSalario {

	//CONSTRUTOR
	public ContaSalario(int num_conta, int agencia, double salario) {
		setNum_conta(num_conta);
		setAgencia(agencia);
		setSalario(salario);
	}
	
	//ATRIBUTOS 
	private int num_conta;
	private int agencia;
	private double salario;
	
	//GETTERS E SETTERS
	public int getNum_conta() {
		return num_conta;
	}
	public void setNum_conta(int num_conta) {
		if(num_conta > 0) {
			this.num_conta = num_conta;
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia > 0) {
			this.agencia = agencia;
		}
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if(salario > 0) {
			this.salario = salario;
		}
	}
	
	public static double desconto(int a) {
		return a;
		
	}
	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSalario [num_conta=");
		builder.append(num_conta);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", salario=");
		builder.append(salario);
		builder.append("]");
		return builder.toString();
	}
}
