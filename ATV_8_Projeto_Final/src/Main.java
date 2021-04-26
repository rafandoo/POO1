import java.util.Scanner;

import classes.Cargo;
import classes.ContaSalario;
import classes.Controle;
import classes.Equipamentos;
import classes.Funcionario;
import classes.Setor;

public class Main {

	public static void main(String[] args) {
			
		//INSTANCIAS
		Funcionario f;
		ContaSalario cs;
		Equipamentos e;
		Setor s;
		Cargo cr;
		Controle c = new Controle();
		Scanner ent = new Scanner(System.in);
		
		//ATRIBUTO DE NAVEGA��O
		int i = 1;

		do {
			switch(i) {
			
			case 1:
				f = new Funcionario();
				f.setNome("Rafael");
				f.setCpf("111.111.111-11");
				f.setMatricula(6);
				
				cs = new ContaSalario(101, 0001, 3201.1);
				f.addContaSalario(cs);
				
				e = new Equipamentos("Material de Escritorio", " ");
				f.addEquipamento(e);
				
				s = Setor.ADMINISTRACAO;
				cr = new Cargo("Auxiliar Administrativo");
				cr.setS(s);
				f.vincularCargoSetor(cr, s);
				
				c.cadastrarFuncionario(f);

				i++;
				break;
				
			case 2:
				f = new Funcionario();
				f.setNome("Josi");
				f.setCpf("222.222.222-22");
				f.setMatricula(2);
				
				cs = new ContaSalario(230, 0001, 4250);
				f.addContaSalario(cs);
				
				e = new Equipamentos("Luva", " ");
				f.addEquipamento(e);
				
				s = Setor.VENDAS;
				cr = new Cargo("Vendedor");
				cr.setS(s);
				f.vincularCargoSetor(cr, s);
				
				c.cadastrarFuncionario(f);
				
				i++;
				break;
				
			case 3:
				f = new Funcionario();
				f.setNome("Tulio");
				f.setCpf("333.333.333-33");
				f.setMatricula(5);
				
				cs = new ContaSalario(15486, 0423, 2360.52);
				f.addContaSalario(cs);
				
				e = new Equipamentos("Empilhadeira", "Capacete/Luva");
				f.addEquipamento(e);
				
				s = Setor.ESTOQUE;
				cr = new Cargo("Repositor");
				cr.setS(s);
				f.vincularCargoSetor(cr, s);
				
				c.cadastrarFuncionario(f);
				
				i++;
				break;
				
			case 4:
				f = new Funcionario();
				f.setNome("Vinicius");
				f.setCpf("444.444.444-44");
				f.setMatricula(10);
				
				cs = new ContaSalario(17854221, 2170, 5633.60);
				f.addContaSalario(cs);
				
				e = new Equipamentos(" ", "Luva/Capacete/Mascara/Protetor auricular");
				f.addEquipamento(e);
				
				s = Setor.FABRICACAO;
				cr = new Cargo("Controle de maquinas");
				cr.setS(s);
				f.vincularCargoSetor(cr, s);
				
				c.cadastrarFuncionario(f);
				
				i++;
				break;
				
			case 5:
				System.out.println(c.imprimirLista());
				i++;
				break;
			
			default:
				System.out.println("erro");
				break;
			}
		} while (i != 6);
		ent.close();
	}
}
