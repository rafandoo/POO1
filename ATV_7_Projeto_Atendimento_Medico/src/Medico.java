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

	

	
	//GET E SET
	public int getCRM() {
		return CRM;
	}
	public void setCRM(int CRM) {
		if(CRM > 0){
			this.CRM = CRM;
		}
	}
	

	
	
	
}
