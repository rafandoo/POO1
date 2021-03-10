
import java.util.Scanner;
public class main {

	public static void main(String [] args) {
		Cadastros a = new Cadastros();
		Scanner ent = new Scanner(System.in);
		Medico m;
		Paciente pc;

		
		int i = 0;
		do {
			System.out.print("OPC: ");
			int opc = ent.nextInt();
			switch (opc) {
			
			case 0:
				m = new Medico();
				m.setNome("Rafael");
				m.setCpf("108");
				m.setCRM(1);
				a.inserirMedico(m);
				break;

			case 1:
				m = new Medico();
				m.setNome("Tulio");
				m.setCpf("101");
				m.setCRM(2);
				a.inserirMedico(m);
				break;
				
			case 2:
				pc = new Paciente();
				pc.setNome("Miguel");
				pc.setCpf("001");
				pc.setCod_paciente(6);
				a.inserirPaciente(pc);
				break;
				
			case 3:
				pc = new Paciente();
				pc.setNome("Josi");
				pc.setCpf("002");
				pc.setCod_paciente(9);
				a.inserirPaciente(pc);
				break;
				
			case 4:
				System.out.println(a.imprimirMed());
				break;
				
			case 5:
				System.out.println(a.imprimirPac());
				break;

			default:
				i=9999;
				break;
			}
			
		} while (i != 9999);

		
	}
}
		
		
