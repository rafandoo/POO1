
public class Medico extends Pessoa{

	//CONSTRRUTORES
	public Medico() {
		this.CRM = "";
	}
	
	public Medico(String nome, String cpf, String CRM) {
		super(nome, cpf);
		this.CRM = CRM;
	}
	
	//ATRIBUTO
	private String CRM;
	
	//GET E SET
	public String getCRM() {
		return CRM;
	}
	public void setCRM(String CRM) {
		if(CRM.length() > 0){
			this.CRM = CRM;
		}
	}
}
