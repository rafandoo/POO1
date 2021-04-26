package atv3_simples;

public class Main {

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
		
		ContaSimples CS2 = new ContaSimples("Banco Brasileiro", 2036, 789562, 1000);
		CS2.setSaldoPoupanca(2000);
		CS2.saquePoupanca(99);
		System.out.println(CS2);
		
		ContaSimples CS3 = new ContaSimples("Banco Master", 0367, 92001, 40, 600);
		System.out.println(CS3);
		
		System.out.println("\n");
		
		//CONTA ESPECIAL
		ContaEspecial CE = new ContaEspecial();
		CE.setBanco("Nubanco");
		CE.setAgencia(3256);
		CE.setNumerodaconta(7851256);
		CE.setSaldo(2530);
		CE.setDiasSemJuros(5);
		CE.setLimite(3000);
		System.out.println(CE);
		
		ContaEspecial CE2 = new ContaEspecial("PixPay", 5027, 9635, 7000);
		CE2.setDiasSemJuros(20);
		CE2.setLimite(20000);
		System.out.println(CE2);
		
		ContaEspecial CE3 = new ContaEspecial("HP investimentos", 9630, 102335, 90000, 25, 100000);
		System.out.println(CE3);

	}

}
