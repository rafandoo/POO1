import java.util.Scanner;

public class main {

	//METODO PARA PAUSA
	private static void pausa() {
		System.out.println("aperte qualquer letra e tecle <enter>, para continuar");
		Scanner entrada = new Scanner(System.in);
		String msg = entrada.next();
		clearBuffer(entrada);
	}
	
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
		System.out.println("= 7- Inicializar sistema              =");
		System.out.println("= 8- Sair                             =");
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
		Atestado at = new Atestado();
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
				if(ini) {
					limpaTela();
					System.out.println("== Sistema de Cadastros  ==");
					System.out.println("= 1- Vizualizar cadastros =");
					System.out.println("= 2- Criar novo cadastro  =");
					System.out.println("===========================");
					System.out.print("\n =Digite uma opcao: ");
					String escl = entrada.next();
					
					if(escl.charAt(0) == '1') {
						System.out.println(cad.imprimirPac());
						pausa();
					} else if(escl.charAt(0) == '2') {
						pc = new Paciente();
						System.out.print("\n\nDigite o nome do paciente: ");
						pc.setNome(entrada.next());
						System.out.print("\nDigite o cpf do paciente: ");
						pc.setCpf(entrada.next());
						System.out.print("\nDigite o codigo do paciente: ");
						pc.setCod_paciente(entrada.nextInt());
						cad.inserirPaciente(pc);
						System.out.println("Cadastro realizado com sucessso!");
						pausa();
					}
				} else {
					System.out.println("Sistema nao inicializado!!");
				}
				break;
				
			case '2':	
				if(ini) {
					limpaTela();
					System.out.println("== Sistema de Cadastros  ==");
					System.out.println("= 1- Vizualizar cadastros =");
					System.out.println("= 2- Criar novo cadastro  =");
					System.out.println("===========================");
					System.out.print("\n =Digite uma opcao: ");
					String escl = entrada.next();
					
					if(escl.charAt(0) == '1') {
						System.out.println(cad.imprimirMed());
						pausa();
					} else if(escl.charAt(0) == '2') {
						m = new Medico();
						System.out.print("\n\nDigite o nome do medico: ");
						m.setNome(entrada.next());
						System.out.print("\nDigite o cpf do medico: ");
						m.setCpf(entrada.next());
						System.out.print("\nDigite o CRM do medico: ");
						m.setCRM(entrada.next());
						cad.inserirMedico(m);
						System.out.println("Cadastro realizado com sucessso!");
						pausa();
					}
				} else {
					System.out.println("Sistema nao inicializado!!");
				}
				break;
				
			case '3':
				if(ini) {
					a = new Atendimento();
					String msg;
					int p1 = 0, p2 = 0, p3 = 0, p4 = 0;
	
					System.out.println("===      Sistema de cadastro de atendimeto       ===");
					System.out.print("\n =Digite o nome do paciente: ");
					a.setPaciente_asr(entrada.next());
					System.out.println("\n =Triagem\n");
					System.out.println("\n=1- Paciente possui sinais de hemorragia?  (S/N) =");
					msg = entrada.next().toUpperCase();
					if(msg.charAt(0) == 'S') {
						p1 = 1;
						msg = "";
					}
					System.out.println("\n=2- Paciente possui sinais de fratura?     (S/N) =");
					msg = entrada.next().toUpperCase();
					if(msg.charAt(0) == 'S') {
						p2 = 1;
						msg = "";
					}
					System.out.println("\n=3- Paciente possui sinais de lesoes?      (S/N) =");
					msg = entrada.next().toUpperCase();
					if(msg.charAt(0) == 'S') {
						p3 = 1;
						msg = "";
					}
					System.out.println("\n=4- Paciente apresenta dores leves/fortes? (S/N) =");
					msg = entrada.next().toUpperCase();
					if(msg.charAt(0) == 'S') {
						p4 = 1;
						msg = "";
					}
					a.def_prioridade(p1, p2, p3, p4);
					System.out.println("\n=Triagem realizada");
					pausa();

				} else {
					System.out.println("Sistema nao inicializado!!");
				}
				break;
				
			case '4':
				if(ini) {
					if(cad.ehvazio_medico()) {
						System.out.println("Sem medicos cadastrados!!");
						pausa();
					} else {
						clearBuffer(entrada);
						System.out.println("===      Sistema de cadastro de consulta       ===");
						System.out.println("\n=Medicos disponiveis: ");
						System.out.println(cad.imprimirMed());
						System.out.println("\n=Paciente: " + ca.getPrim().getA().getPaciente_asr());
						System.out.print("\n=Digite o medico para realizar o atendimento: ");
						String medico = entrada.next();
						clearBuffer(entrada);
						System.out.print("\n=Digite o dia do inicio da consulta: ");
						int d = entrada.nextInt();
						System.out.print("\n=Digite o mes do inicio da consulta: ");
						int mm = entrada.nextInt();
						System.out.print("\n=Digite o ano do inicio da consulta: ");
						int y = entrada.nextInt();
						System.out.print("\n=Digite a hora do inicio da consulta: ");
						int h = entrada.nextInt();
						System.out.print("\n=Digite o min do inicio da consulta: ");
						int mim = entrada.nextInt();
						c.setInicio(d, mm, y, h, mim);
						
						System.out.print("\n=Digite o dia do fim da consulta: ");
						d = entrada.nextInt();
						System.out.print("\n=Digite o mes do fim da consulta: ");
						mm = entrada.nextInt();
						System.out.print("\n=Digite o ano do fim da consulta: ");
						y = entrada.nextInt();
						System.out.print("\n=Digite a hora do fim da consulta: ");
						h = entrada.nextInt();
						System.out.print("\n=Digite o min do fim da consulta: ");
						mim = entrada.nextInt();
						c.setFim(d, mm, y, h, mim);
						
						c.finalizaConsulta(ca.getPrim().getA().getPaciente_asr(), medico, c.getData_inicio(), c.getData_fim());
						ca.removePrim();
						System.out.println("\n=Deseja gerar um atestado? (S/N)");
						String msg = entrada.next().toUpperCase();
						if(msg.charAt(0) == 'S') {
							System.out.print("\n=Digite o cod CID10: ");
							at.setCID10(entrada.next());
							at.emitirAtestado(ca);
							System.out.println("\n=Atestado gerado");
						}
						System.out.println("\n=Atendimento realizado com sucesso!");
						pausa();
					}
				} else {
					System.out.println("Sistema nao inicializado!!");
				}
				break;
				
			case '5':
				if(ini) {
					System.out.println("===      Consulta fila de espera       ===\n");
					System.out.println(ca.imprimirFila());
					System.out.println();
					pausa();
					
				} else {
					System.out.println("Sistema nao inicializado!!");
				}
				break;
				
			case '6':
				if(ini) {
					System.out.println("===  Consulta historico de atendimetos   ===\n");
					System.out.println(c.mostraHist());
					System.out.println();
					pausa();
				} else {
					System.out.println("Sistema nao inicializado!!");
				}
				break;
				
			case '7': 
				if(ini == false) {
					System.out.println("Deseja inicializar o sistema? (S/N)");
					String escl = entrada.next().toUpperCase();
					if(escl.charAt(0) == 'S') {
						int i = 1;
						while(i != 21) {
							if(i==1) {
								pc = new Paciente();
								pc.setNome("Miguel");
								pc.setCpf("111.111.111-11");
								pc.setCod_paciente(1);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(0, 1, 1, 0);
								a.setPaciente_asr("Miguel");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==2) {
								pc = new Paciente();
								pc.setNome("Josi");
								pc.setCpf("222.222.222-22");
								pc.setCod_paciente(2);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(1, 1, 1, 0);
								a.setPaciente_asr("Josi");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==3) {
								pc = new Paciente();
								pc.setNome("Rosa");
								pc.setCpf("333.333.333-33");
								pc.setCod_paciente(3);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(1, 1, 1, 1);
								a.setPaciente_asr("Rosa");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==4) {
								pc = new Paciente();
								pc.setNome("Juliana");
								pc.setCpf("444.444.444-44");
								pc.setCod_paciente(4);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(0, 0, 1, 0);
								a.setPaciente_asr("Juliana");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==5) {
								pc = new Paciente();
								pc.setNome("Henrique");
								pc.setCpf("555.555.555-55");
								pc.setCod_paciente(5);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(0, 0, 0, 0);
								a.setPaciente_asr("Henrique");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==6) {
								pc = new Paciente();
								pc.setNome("Pedro");
								pc.setCpf("666.666.666-66");
								pc.setCod_paciente(6);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(1, 1, 1, 0);
								a.setPaciente_asr("Pedro");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==7) {
								pc = new Paciente();
								pc.setNome("Felipe");
								pc.setCpf("777.777.777-77");
								pc.setCod_paciente(7);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(1, 1, 1, 1);
								a.setPaciente_asr("Felipe");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==8) {
								pc = new Paciente();
								pc.setNome("Lucas");
								pc.setCpf("888.888.888-88");
								pc.setCod_paciente(8);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(0, 1, 1, 0);
								a.setPaciente_asr("Lucas");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==9) {
								pc = new Paciente();
								pc.setNome("Tiara");
								pc.setCpf("999.999.999-99");
								pc.setCod_paciente(9);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(0, 0, 1, 0);
								a.setPaciente_asr("Tiara");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==10) {
								pc = new Paciente();
								pc.setNome("Vania");
								pc.setCpf("101.010.101-01");
								pc.setCod_paciente(10);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(0, 0, 0, 1);
								a.setPaciente_asr("Vania");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==11) {
								pc = new Paciente();
								pc.setNome("Nayara");
								pc.setCpf("111.111.111-00");
								pc.setCod_paciente(11);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(1, 1, 1, 1);
								a.setPaciente_asr("Nayara");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==12) {
								pc = new Paciente();
								pc.setNome("Gabriel");
								pc.setCpf("121.212.121-21");
								pc.setCod_paciente(12);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(0, 0, 0, 1);
								a.setPaciente_asr("Miguel");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==13) {
								pc = new Paciente();
								pc.setNome("Natalia");
								pc.setCpf("131.313.131-31");
								pc.setCod_paciente(13);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(0, 1, 1, 0);
								a.setPaciente_asr("Natalia");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==14) {
								pc = new Paciente();
								pc.setNome("Joao");
								pc.setCpf("141.414.141-41");
								pc.setCod_paciente(14);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(1, 1, 1, 1);
								a.setPaciente_asr("Miguel");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==15) {
								pc = new Paciente();
								pc.setNome("Enzo");
								pc.setCpf("151.515.151-51");
								pc.setCod_paciente(15);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(0, 1, 1, 0);
								a.setPaciente_asr("Enzo");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==16) {
								pc = new Paciente();
								pc.setNome("Valentina");
								pc.setCpf("161.616.161-61");
								pc.setCod_paciente(16);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(0, 0, 0, 0);
								a.setPaciente_asr("Valentina");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==17) {
								pc = new Paciente();
								pc.setNome("Cristiano");
								pc.setCpf("171.717.171-71");
								pc.setCod_paciente(17);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(0, 0, 1, 0);
								a.setPaciente_asr("Cristiano");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==18) {
								pc = new Paciente();
								pc.setNome("Guilherme");
								pc.setCpf("181.818.181-81");
								pc.setCod_paciente(18);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(0, 1, 0, 0);
								a.setPaciente_asr("Guilherme");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==19) {
								pc = new Paciente();
								pc.setNome("Adaljiza");
								pc.setCpf("191.919.191-91");
								pc.setCod_paciente(19);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(0, 0, 0, 0);
								a.setPaciente_asr("Adalzija");
								ca.gera_atendimento(a);
								i++;
							}
							if(i==20) {
								pc = new Paciente();
								pc.setNome("Arthur");
								pc.setCpf("202.020.202-02");
								pc.setCod_paciente(20);
								cad.inserirPaciente(pc);
								a = new Atendimento();
								a.def_prioridade(1, 1, 1, 1);
								a.setPaciente_asr("Arthur");
								ca.gera_atendimento(a);
								i++;
							}
						}
						ini = true;
						System.out.println("Sistema inicializado com sucesso!");
						pausa();
					}
				} else {
					System.out.println("Sistema ja inicializado!");
					pausa();
				}
				break;
			
			default:
				System.out.println();
				break;
			}
			
		} while(opc != '8');
		entrada.close();
		System.exit(0);

	}	
}
