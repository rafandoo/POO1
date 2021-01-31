package atv3_simples;

public class main {

	public static void main(String[] args) {
		
		//CONTA SIMPLES
		ContaSimples CS = new ContaSimples();
		CS.setBanco("Intermedium");
		CS.setAgencia(0001);
		CS.setNumerodaconta(1234566);
		CS.deposito(256);
		CS.depositoPoupanca(339);
		CS.saque(100);
		System.out.println(CS);
		
		
		
		
		
		
		
		

	}

}
