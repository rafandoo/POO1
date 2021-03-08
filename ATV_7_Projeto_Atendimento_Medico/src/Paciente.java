
public class Paciente extends Pessoa{

	//CONSTRUTORES
	public Paciente() {
		super();
	}
	
	public Paciente(String nome, String cpf, int cod_paciente) {
		super(nome, cpf);
		setCod_paciente(cod_paciente);
	}
	
	//ATRIBUTO
	private int cod_paciente;
	
	//GET E SET
	public int getCod_paciente() {
		return cod_paciente;
	}
	public void setCod_paciente(int cod_paciente) {
		if(cod_paciente > 0) {
			this.cod_paciente = cod_paciente;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [cod_paciente=");
		builder.append(cod_paciente);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
