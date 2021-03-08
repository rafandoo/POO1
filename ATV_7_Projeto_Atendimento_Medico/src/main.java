
import java.util.Scanner;
public class main {

	public static void main(String [] args) {
		Atendimento a = new Atendimento();
		Scanner ent = new Scanner(System.in);
		Medico m;
		Pessoa p;

		
		int i = 0;
		do {
			System.out.print("OPC: ");
			int opc = ent.nextInt();
			switch (opc) {
			case 0:

				m = new Medico();
				p = new Pessoa();
				
				m.setNome("Rafael");
				m.setCpf("108");
				m.setCRM(1);

				a.inserirPrim(m);
				i++;
				break;

			case 1:
				m = new Medico();
				p = new Pessoa();
				
				m.setNome("Tulio");
				m.setCpf("101");
				m.setCRM(2);

				a.inserirPrim(m);
				i++;
				break;
			case 2:
				System.out.println(a.imprimir());
				break;
				
			default:
				i=3;
				break;
			}
			
		} while (i != 3);

		
	}
}
		
		
