import java.util.Scanner;
public class cxe {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int saque, rsaque = 0;
		int n1,n5,n10,n50,n100 = 0;
		
		System.out.println("==== CAIXA ELETRONICO ====");
		System.out.println("\nNotas disponiveis: 1, 5, 10, 50 e 100");
		System.out.print("\nDigite o valor do saque desejado: R$");
		saque = entrada.nextInt();
		
		if (saque < 10) {
			System.out.println("O valor minimo para saque é de R$10,00");
			System.exit(0);
		}
		if (saque > 600) {
			System.out.println("Valor indisponivel para saque");
			System.exit(0);
		}
		rsaque = saque;
		
		n100 = rsaque/100;
		rsaque = rsaque-(n100*100);
		
		n50 = rsaque/50;
		rsaque = rsaque-(n50*50);
		
		n10 = rsaque/10;
		rsaque = rsaque-(n10*10);
		
		n5 = rsaque/5;
		rsaque = rsaque-(n5*5);
		
		n1 = rsaque;
		
		System.out.println("\n\n=== Contagem de notas sacadas ===");
		System.out.println("Notas de R$100,00: "+n100);
		System.out.println("Notas de R$50,00: "+n50);
		System.out.println("Notas de R$10,00: "+n10);
		System.out.println("Notas de R$5,00: "+n5);
		System.out.println("Notas de R$1,00: "+n1);

		entrada.close();
	}

}
				