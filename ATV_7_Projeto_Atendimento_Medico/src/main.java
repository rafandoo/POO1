
public class main {

	public static void main(String [] args) {


		Paciente pc = new Paciente();
		pc.setNome("Rafa");
		pc.setCpf("10875");
		pc.setCod_paciente(10);
		System.out.println(pc);
		
		Medico m = new Medico("BOB", "10144", 20);
		Especialidade e = new Especialidade("Cirurgiao");
		m.addEspecialidade(e);
		System.out.println(m);
		
		Atendimento a = new Atendimento();
		a.def_prioridade(1, 1, 1, 1);

		System.out.println(a);
		

		FilaAtendimento fa = new FilaAtendimento();
		
		fa.addFila(a);
		fa.mostraFila();
		System.out.println(fa);
		
	}
	
	
	
	
}
