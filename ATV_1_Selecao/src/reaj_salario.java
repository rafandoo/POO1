import java.util.Scanner;
public class reaj_salario {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		double salario,nsalario = 0;
		float preajust = 0.00f;
		
		System.out.println("---- ORGANIZACAO TABAJARA ----\n");
		System.out.println("Sistema de reajuste salarial");
		System.out.print("\nDigite o salario do funcionario: R$");
		salario = entrada.nextDouble();
		
		if (salario <= 280.00) {
			preajust = 0.20f;
			nsalario = salario+(salario*preajust);
		}
		if ((salario > 280.00)&&(salario < 700.00)) {
			preajust = 0.15f;
			nsalario = salario+(salario*preajust);
		}
		if ((salario > 700.00)&&(salario < 1500.00)) {
			preajust = 0.10f;
			nsalario = salario+(salario*preajust);
		}
		if (salario >= 1500.00) {
			preajust = 0.05f;
			nsalario = salario+(salario*preajust);
		}
		entrada.nextLine();
		
		System.out.println("\n\n====RESUMO==== ");
		System.out.printf("Salario anterior: R$"+"%.2f",salario);
		System.out.print("\nPercentual de aumento: "+(preajust*100)+"%");
		System.out.printf("\nValor do aumento: RS"+"%.2f",(nsalario-salario));
		System.out.printf("\nNovo salario: R$"+"%.2f",nsalario);	
		entrada.close();
	}
}
