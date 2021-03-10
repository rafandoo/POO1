import java.util.ArrayList;
import java.util.List;

public class HistoricoAtendimento {

	//LISTA
	private List<Cadastros> hi = new ArrayList<Cadastros>();
	
	//METODOS
	public boolean addHist(Cadastros a) {
		return hi.add(a);
	}
	
	public String mostraHist() {
		String msg = "";
		for (Cadastros cadastros : hi) {
			msg += cadastros;
		}
		return msg;		
	}
}
