import java.util.ArrayList;
import java.util.List;

public class HistoricoAtendimento {

	//LISTA
	private List<Atendimento> hi = new ArrayList<Atendimento>();
	
	//METODOS
	public boolean addHist(Atendimento a) {
		return hi.add(a);
	}
	
	public String mostraHist() {
		String msg = "";
		for (Atendimento atendimento : hi) {
			msg += atendimento;
		}
		return msg;		
	}
}
