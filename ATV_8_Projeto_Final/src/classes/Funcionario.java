package classes;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa implements Login{

	//CONSTRUTORES
	public Funcionario() {

	}
	
	public Funcionario(String nome, String cpf) {
		super(nome, cpf);
	}
	
	public Funcionario(String nome, String cpf, int matricula) {
		super(nome, cpf);
		setMatricula(matricula);
	}
	
	//ATRIBUTOS
	private int matricula;
	
	//LISTAS
	private List<Equipamentos> lequip = new ArrayList<Equipamentos>();
	private List<ContaSalario> lconta = new ArrayList<ContaSalario>();
	Cargo c;
	
	//GETTERS E SETTERS
	public int getMatricula() {
		return matricula;
	}	
	public void setMatricula(int matricula) {
		if(matricula > 0) {
			this.matricula = matricula;
		}
	}
	
	public Cargo getC() {
		return c;
	}
	public void setC(Cargo c) {
		this.c = c;
	}

	//METODOS
	public void vincularCargoSetor(Cargo cargo, Setor s) {
		cargo.setS(s);
		setC(cargo);
	}
	
	public String verfificaSalario(ContaSalario conta) {
		return conta.toString();
	}
	
	public boolean addEquipamento(Equipamentos equipamento) {
		return lequip.add(equipamento);
	}
	
	public boolean addContaSalario(ContaSalario contasalario) {
			return (lconta.add(contasalario));
	}
	
	public ContaSalario mostraConta() {
		return (lconta.get(0));
	}

	public Equipamentos mostraEquip() {
		if(lequip.isEmpty()) {
			return null;
		} else {
			return (lequip.get(0));
		}
	}
	
	public Cargo mostraCargoSetor() {
		return this.c;
	}

	@Override
	public String usuario() {
		// TODO Auto-generated method stub
		return null;
	}
}
