package TODO;

public class Funcionario extends Pessoa{

	//CONSTRUTORES
	public Funcionario() {
		super();
	}
	
	//ATRIBUTOS
	private int matricula;
	
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
	public void getSetor() {
		
	}
	
	
	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [matricula=");
		builder.append(matricula);
		builder.append("]");
		return builder.toString();
	}

}
