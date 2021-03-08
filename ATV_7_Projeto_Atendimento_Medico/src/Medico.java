import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa{

	//CONSTRRUTORES
	public Medico() {
		super();
	}
	
	public Medico(String nome, String cpf, int CRM) {
		super(nome, cpf);
		this.CRM = CRM;
	}
	
	//ATRIBUTOS
	private int CRM;
	private List<Especialidade> lesp = new ArrayList<Especialidade>();
	
	//GET E SET
	public int getCRM() {
		return CRM;
	}
	public void setCRM(int CRM) {
		if(CRM > 0){
			this.CRM = CRM;
		}
	}
	
	//METODO
	public boolean addEspecialidade(Especialidade e) {
		return lesp.add(e);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medico [CRM=");
		builder.append(getCRM());
		builder.append(", especialidade: ");
		for (Especialidade especialidade : lesp) {
			builder.append(lesp);
		}
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
