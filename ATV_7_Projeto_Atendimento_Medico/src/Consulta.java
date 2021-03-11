import java.util.Date;

public class Consulta extends Controle_Atendimento {

	//INSTANCIAS
	Date data_inicio = new Date();
	Date data_fim = new Date();
	HistoricoAtendimento ha = new HistoricoAtendimento();
	
	
	//GETTERS E SETTERS
	@SuppressWarnings("deprecation")
	public void setInicio(int d, int m, int y, int h, int mm) {
		data_inicio.setDate(d);
		data_inicio.setMonth(m);
		data_inicio.setYear(y-1900);
		
		data_inicio.setHours(h);
		data_inicio.setMinutes(mm);
	}
	public Date getData_inicio() {
		return data_inicio;
	}
	
	@SuppressWarnings("deprecation")
	public void setFim(int d, int m, int y, int h, int mm) {
		data_fim.setDate(d);
		data_fim.setMonth(m);
		data_fim.setYear(y-1900);
		
		data_fim.setHours(h);
		data_fim.setMinutes(mm);
	}
	public Date getData_fim() {
		return data_fim;
	}

	//METODOS
	public void finalizaConsulta(String nome_paciente, String nome_medico, Date h1, Date h2) {
		ha.addHist(nome_paciente, nome_medico, h1, h2);	
	}
	
	public String mostraHist() {
		return ha.mostraHist();
	}
}
