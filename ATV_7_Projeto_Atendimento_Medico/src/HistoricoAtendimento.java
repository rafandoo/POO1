import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

public class HistoricoAtendimento {

	SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy hh:mm");
	
	//LISTAS
	private List<String> nome_paciente = new ArrayList<String>();
	private List<String> nome_medico = new ArrayList<String>();
	private List<Date> h1 = new ArrayList<Date>();
	private List<Date> h2 = new ArrayList<Date>();
	
	//METODOS
	public void addHist(String nome_paciente, String nome_medico, Date h1, Date h2) {
		this.nome_paciente.add(nome_paciente);
		this.nome_medico.add(nome_medico);
		this.h1.add(h1);
		this.h2.add(h2);	
	}
	
	public String mostraHist() {
		String msg = "";
		for (int i = 0; i < nome_paciente.size(); i++) {
			msg += "Paciente: ";
			msg += nome_paciente.get(i);
			msg += " | Medico: ";
			msg += nome_medico.get(i);
			msg += " | Horario de chegada: ";
			msg += formatar.format(h1.get(i));
			msg += " | Horario de saida: ";
			msg += formatar.format(h2.get(i));
			msg += "\n";
		}
		return msg;
	}
}
