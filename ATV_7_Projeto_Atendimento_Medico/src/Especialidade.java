
public class Especialidade {

	//CONSTRUTOR 
	public Especialidade(String residencia) {
		setResidencia(residencia);
	}
	
	//ATRIBUTO
	private String residencia;
	
	//GET E SET
	public String getResidencia() {
		return residencia;
	}
	public void setResidencia(String residencia) {
		if(residencia.length() > 0) {
			this.residencia = residencia;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Especialidade [residencia=");
		builder.append(residencia);
		builder.append("]");
		return builder.toString();
	}
	
	
}
