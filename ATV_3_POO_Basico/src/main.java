import java.util.Scanner;
public class main {
	
	public static void main(String[] args) {
		int esc = 0;
		int tipoT = 0;
		Scanner ent = new Scanner(System.in);
		piramide piramidecalc = new piramide();
		
		System.out.print("=== Sistema de calculo de pintura em piramides ===");
		System.out.print("\n\nDigite a altura: ");
		piramidecalc.setHaltura(ent.nextDouble());
		
		System.out.print("\nDigite a aresta da base: ");
		piramidecalc.setArestaBase(ent.nextDouble());
		
		System.out.print("\nTintas disponiveis, baldes de 18L:\n1-Tinta basica R$127,90"
				+ "\n2-Tinta media R$258,98\n3-Tinta premium R$344,34");
		System.out.print("\nDigite a opção desejada: ");
		tipoT = ent.nextInt();
		
		System.out.print("\n\n\n\n\n");
		System.out.print("\nApotema: "+piramidecalc.apotema());
		System.out.print("\nArea da base: "+piramidecalc.areaB());
		System.out.print("\nArea lateral: "+piramidecalc.areaL());
		System.out.print("\nArea total: "+piramidecalc.areaT());
		System.out.print("\nVolume: "+piramidecalc.setVolume());
		System.out.print("\nLitros de tinta necessarios: "+piramidecalc.setLitros());
		System.out.print("\nLatas de tinta necessarias: "+piramidecalc.setQunlatas());
		System.out.printf("\nValor total: "+"%.2f", piramidecalc.tipoTinta(tipoT));
		
		ent.close();
	}

}
