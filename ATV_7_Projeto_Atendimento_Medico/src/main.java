import java.util.Scanner;

public class main {

	//METODO PARA LIMPAR A TELA DE SAIDA
	private static void limpaTela() {
		System.out.println("\n\n\n\n\n\n\n\n");
	}
		
	//METODO PARA LIMPAR BUFFER DO TECLADO \n
	private static void clearBuffer(Scanner scanner) {
		if (scanner.hasNextLine()) {
			scanner.nextLine();
	    }
	}
	
	//MENU PRINCIPAL
	public static char menu() {
		String msg;
		Scanner entrada = new Scanner(System.in);
		limpaTela();
		
		System.out.println("** SISTEMA DE GESTAO DE CONSULTORIOS **\n");
		System.out.println("====        MENU DE FUNCOES        ====");
		System.out.println("= 1- Cadastro paciente                =");
		System.out.println("= 2- Cadastro medico                  =");
		System.out.println("= 3- Cadastro atendimento             =");
		System.out.println("= 4- Realiza atendimento              =");
		System.out.println("= 5- Consulta fila de espera          =");
		System.out.println("= 6- Consulta historico atendimentos  =");
		System.out.println("=======================================");
		System.out.print("\n =Digite uma opcao: ");
		msg = entrada.next();
		clearBuffer(entrada);
		return msg.charAt(0);
	}
	
	
	public static void main(String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		Cadastros cad = new Cadastros();
		Controle_Atendimento ca = new Controle_Atendimento();
		Consulta c = new Consulta();	
		Atendimento a;
		Medico m;
		Paciente pc;
		char opc;
		boolean ini = false;
		
		do {
			opc = menu();
			limpaTela();
			switch (opc) {
			case '1': 
				if(ini == false) {
					System.out.println("Deseja inicializar o sistema? (S/N)");
				}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + opc);
			}
			
		} while(opc != '7');
		entrada.close();
		System.exit(0);
		
		
		


		
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
				a.setPaciente_asr(cad.pesquisaPaciente("Josi"));
				ca.gera_atendimento(a);
				break;
				
			case 8:
				a = new Atendimento();
				a.def_prioridade(0, 1, 1, 0);
				a.setPaciente_asr(cad.pesquisaPaciente("Miguel"));
				ca.gera_atendimento(a);
				break;
				
			case 9:
				a = new Atendimento();
				a.def_prioridade(0, 1, 0, 0);
				a.setPaciente_asr("RAF");
				ca.gera_atendimento(a);
				break;
				
			case 10:
				a = new Atendimento();
				System.out.println(ca.imprimirFila());
				break;
				
			case 11:
				ca.removePrim();
				System.out.println(ca.imprimirFila());
				break;
				
			case 15: 
				c.setInicio(11, 03, 2020, 12, 35);
				c.setFim(12, 03, 2020, 16, 20);
				c.finalizaConsulta(ca.getPrim().getA().getPaciente_asr(), "Tulio", c.getData_inicio(), c.getData_fim());
				System.out.println(c.mostraHist());
				
				break;
				
			case 13:
				System.out.println(c.mostraHist());
				System.out.println(ca.imprimirFila());
				break;
				
			default:
				i=9999;
				break;
			}
			
		} while (i != 9999);

		
	}
}
		
		
