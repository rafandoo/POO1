
public class Atestado extends Consulta{

	//ATRIBUTOS
	private String CID10;
	
	//GET E SET
	public String getCID10() {
		return CID10;
	}
	public void setCID10(String cID10) {
		CID10 = cID10;
	}
	
	public void emitirAtestado(Cadastros cadastros) {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atestado [CID10=");
		builder.append(CID10);
		builder.append("]");
		return builder.toString();
	}
	
}
