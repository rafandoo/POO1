package todo;

public class Main {

	public static void main(String[] args) {
		
		Cargo cg = new Cargo();
		cg.setFuncao("Administracao");
		
		ContaSalario cs = new ContaSalario(1, 0002, 3000.21);
		
		Equipamentos e1 = new Equipamentos("chave philips", "luva nitrilica");
		Equipamentos e2 = new Equipamentos("martelo", "oculos");
		
		Funcionario f = new Funcionario();
		
		f.setCpf("111.111.111-11");
		f.setNome("Rafael");
		f.setMatricula(1);
		f.addEquipamento(e1);
		f.addEquipamento(e2);
		
		
		System.out.println(f);
		System.out.println(f.getSetor(cg));
		System.out.println(f.verfificaSalario(cs));

	}

}
