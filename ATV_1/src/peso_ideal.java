import java.util.Scanner;
public class peso_ideal {
	public static void main (String[] args){
		Scanner entrada = new Scanner(System.in);
		double peso,altura,pesoI = 0;
		String sexo,nome = "";
		System.out.print("Ola! Digite seu nome: ");
		nome = entrada.nextLine();
		System.out.print("\nDigite seu sexo (F/M): ");
		sexo = entrada.nextLine().toUpperCase();
		System.out.print("\nDigite sua altura em cm: ");
		altura = entrada.nextDouble();
		altura = altura/100;
		System.out.print("\nDigite seu peso em kg: ");
		peso = entrada.nextDouble();

		switch (sexo){
			case "F":
				pesoI = (62.1*altura)-44.7;
				sexo = "FEMININO";
				break;
			case "M":
				pesoI = (72.7*altura)-58; 
				sexo = "MASCULINO";
				break;
			default:
				System.out.println("erro no sistema");
				break;
		}
		
		System.out.println("\n\n"+nome+", suas informações são: \nAltura: "+altura+""
				+"\nPeso: "+peso+"\nSexo: "+sexo);
		System.out.print("Seu peso ideal de acordo com seus dados é: ");
		System.out.printf( "%.2f", pesoI );
		pesoI = (int)pesoI;
		peso = (int)peso;
		if ((peso==pesoI)) {
			System.out.println("\nVoce esta na faixa ideal de peso");
		}
		if (peso>pesoI) {
			System.out.println("\nSeu peso esta acima do ideal");
		}
		if (peso<pesoI) {
			System.out.println("\nSeu peso esta abaixo do ideal");
			
		}
		entrada.close();
	}
}
