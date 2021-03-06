package todo;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa{

	//CONSTRUTORES
	public Funcionario() {

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
	public String getSetor(Cargo cargo) { //VER URGENTE
		return cargo.toString();
	}
	
	public String verfificaSalario(ContaSalario conta) {
		return conta.toString();
	}
	
	public boolean addEquipamento(Equipamentos equipamento) {
		return lequip.add(equipamento);
	}
	
	public boolean addContaSalario(ContaSalario contasalario) {
		return lconta.add(contasalario);
	}
	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [matricula=");
		builder.append(matricula);
		for (Equipamentos equipamentos : lequip) {
			builder.append(equipamentos.toString());
		}
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
