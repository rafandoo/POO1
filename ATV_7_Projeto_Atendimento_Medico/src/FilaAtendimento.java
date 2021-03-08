import java.util.ArrayList;
import java.util.List;

public class FilaAtendimento {

	//LISTA
	private List<Atendimento> LA = new ArrayList<Atendimento>();
	
	//METODOS
	public boolean addFila(Atendimento a) {
		return LA.add(a);
	}
	
	public String mostraFila() {
		String msg = "";
		for (Atendimento atendimento : LA) {
			msg += atendimento;
		}
		return msg;
	}
	
	public boolean realiza_atend(Atendimento a) {
		return LA.remove(a);
	}
	
	
}
