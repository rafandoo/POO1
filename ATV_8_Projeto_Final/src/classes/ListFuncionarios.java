package classes;
import java.util.List;
import java.util.ArrayList;

public class ListFuncionarios {

	List<Funcionario> lfunc = new ArrayList<Funcionario>();
	
	public void addFunc(Funcionario f) {
		lfunc.add(f);
	}
	
	public List<Funcionario> getLista() {
		return lfunc;
	}
}
