
import java.util.Scanner;
public class main {

	public static void main(String [] args) {
		Cadastros cad = new Cadastros();
		
		Atendimento a;
		
		Consulta c = new Consulta(); 
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
				m.setCRM("1");
				cad.inserirMedico(m);
				break;

			case 1:
				m = new Medico();
				m.setNome("Tulio");
				m.setCpf("101");
				m.setCRM("2");
				cad.inserirMedico(m);
				break;
				
			case 2:
				pc = new Paciente();
				pc.setNome("Miguel");
				pc.setCpf("001");
				pc.setCod_paciente(6);
				cad.inserirPaciente(pc);
				break;
				
			case 3:
				pc = new Paciente();
				pc.setNome("Josi");
				pc.setCpf("002");
				pc.setCod_paciente(9);
				cad.inserirPaciente(pc);
				break;
				
			case 4:
				System.out.println(cad.imprimirMed());
				break;
				
			case 5:
				System.out.println(cad.imprimirPac());
				break;

			case 6:
				System.out.println(cad.pesquisaMedico("1"));
				System.out.println(cad.pesquisaPaciente("Josi"));
				break;
				
			case 7:
				a = new Atendimento();
				a.def_prioridade(1, 1, 1, 1);

				a.emergencial(a);
				break;
				
			case 8:
				a = new Atendimento();
				System.out.println(a.imprimirFila());
				break;
				
			default:
				i=9999;
				break;
			}
			
		} while (i != 9999);

		
	}
}
		
		
