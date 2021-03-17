import java.util.Scanner;

import manp.xml.*;

import classes.Cargo;
import classes.ContaSalario;
import classes.Controle;
import classes.Equipamentos;
import classes.Funcionario;
import classes.Setor;
import classes.ListFuncionarios;
import classes.Lista_funcionarios;

import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ListFuncionarios lf2 = new ListFuncionarios();
		
		
		Funcionario f;
		ContaSalario cs;
		Equipamentos e;
		Setor s;
		Cargo cr;
		Controle c = new Controle();
		
		Scanner ent = new Scanner(System.in);
		
		int i = 1;

		do {
			//System.out.print("OPC: ");
			//i = ent.nextInt();
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
				
				lf2.addFunc(f);
				c.cadastrarFuncionario(f);

				i++;
				break;
				
			case 2:
				f = new Funcionario();
				f.setNome("Tulio");
				f.setCpf("101");
				f.setMatricula(2);
				
				cs = new ContaSalario(230, 0001, 4250);
				f.addContaSalario(cs);
				
				s = Setor.VENDAS;
				cr = new Cargo("Vendedor");
				cr.setS(s);
				f.vincularCargoSetor(cr, s);
				
				lf2.addFunc(f);
				c.cadastrarFuncionario(f);
				
				i++;
				break;
				
			case 3:
				System.out.println(c.imprimirLista());
				i++;
				break;
				
			case 4:
				System.out.println("\n"+Controle.getQuantFuncionario());
				i++;
				break;
			case 5:
				
				ManipXML.gravarXMLCliente(lf2.getLista());	
				List<Funcionario> list = ManipXML.lerXMLCOM();
				
				for (Iterator iter = list.iterator(); iter.hasNext();) {
					Funcionario element = (Funcionario) iter.next();
					System.out.println(element.toString() + "\n---");	
				}
				
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
