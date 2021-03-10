import java.text.SimpleDateFormat;
import java.util.Date;

public class Consulta extends Atendimento {

	Date data_inicio = new Date();
	Date data_fim = new Date();
	SimpleDateFormat formatar = new SimpleDateFormat("hh:mm");
	
	@SuppressWarnings("deprecation")
	public void setInicio(int h, int m) {
		data_inicio.setHours(h);
		data_inicio.setMinutes(m);
	}
	
	@SuppressWarnings("deprecation")
	public void setFim(int h, int m) {
		data_fim.setHours(h);
		data_fim.setMinutes(m);
	}
	
}
