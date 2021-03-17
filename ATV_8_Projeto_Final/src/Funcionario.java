import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa{

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
	
	private List<Equipamentos> lequip = new ArrayList<Equipamentos>();
	private List<ContaSalario> lconta = new ArrayList<ContaSalario>();
	
	//GETTERS E SETTERS
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		if(matricula > 0) {
			this.matricula = matricula;
		}
	}
	
	//METODOS
	
	
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
	
	
}
