
public class Medico extends Pessoa{

	//CONSTRRUTORES
	public Medico() {
		super();
	}
	
	public Medico(String nome, String cpf, int CRM) {
		super(nome, cpf);
		setCRM(CRM);
	}
	
	//ATRIBUTO
	private int CRM;
	
	//GET E SET
	public int getCRM() {
		return CRM;
	}
	public void setCRM(int cRM) {
		if(CRM > 0){
			CRM = cRM;
		}
	}
}
