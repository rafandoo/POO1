import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa{

	//CONSTRRUTORES
	public Medico() {
		this.CRM = 0;
	}
	
	public Medico(String nome, String cpf, int CRM) {
		super(nome, cpf);
		this.CRM = CRM;
	}
	
	//ATRIBUTOS
	private int CRM;
	private List<Especialidade> lesp = new ArrayList<Especialidade>();
	private List<Pessoa> lpes = new ArrayList<Pessoa>();
	
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
	public boolean addPessoa(Pessoa p) {
		return lpes.add(p);
	}

	public void imp(int i) {
		System.out.println(lesp.get(i));
		System.out.println(lpes.get(i));
		
	}
	
	
	
	
}
