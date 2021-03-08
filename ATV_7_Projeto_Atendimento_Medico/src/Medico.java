import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa{

	//CONSTRRUTORES
	public Medico() {
		super();
	}
	
	public Medico(String nome, String cpf, int CRM) {
		super(nome, cpf);
		setCRM(CRM);
	}
	
	//ATRIBUTOS
	private int CRM;
	private List<Especialidade> lesp = new ArrayList<Especialidade>();
	
	//GET E SET
	public int getCRM() {
		return CRM;
	}
	public void setCRM(int cRM) {
		if(CRM > 0){
			CRM = cRM;
		}
	}
	
	//METODO
	public boolean addEspecialidade(Especialidade e) {
		return lesp.add(e);
	}
}
