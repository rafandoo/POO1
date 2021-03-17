import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Funcionario f;
		ContaSalario cs;
		Equipamentos e;
		Setor s;
		Cargo cr;
		Controle c = new Controle();
		
		Scanner ent = new Scanner(System.in);
		
		Equipamentos e1 = new Equipamentos("chave philips", "luva nitrilica");
		Equipamentos e2 = new Equipamentos("martelo", "oculos");
		
		int i;

		do {
			System.out.print("OPC: ");
			i = ent.nextInt();
			switch(i) {
			
			case 1:
				f = new Funcionario();
				f.setNome("Rafael");
				f.setCpf("108");
				f.setMatricula(6);
				
				cs = new ContaSalario(101, 0001, 3201.1);
				f.addContaSalario(cs);
				
				e = new Equipamentos("oculos", "luva");
				f.addEquipamento(e);
				
				s = Setor.ADMINISTRACAO;
				cr = new Cargo("AuxADM");
				cr.setS(s);
				f.vincularCargoSetor(cr, s);
				
				c.cadastrarFuncionario(f);
				break;
				
			case 2:
				f = new Funcionario();
				f.setNome("Tulio");
				f.setCpf("101");
				f.setMatricula(2);
				
				cs = new ContaSalario(230, 0001, 4250);
				f.addContaSalario(cs);
				c.cadastrarFuncionario(f);
				
				s = Setor.VENDAS;
				cr = new Cargo("Vendedor");
				cr.setS(s);
				f.vincularCargoSetor(cr, s);
				break;
				
			case 3:
				System.out.println(c.imprimirLista());
				break;
				
			case 4:
				System.out.println("\n"+c.getQuantFuncionario());
				break;
			
			default:
				System.out.println("erro");
				break;
			}
		} while (i != 9999);
		
	}

}
