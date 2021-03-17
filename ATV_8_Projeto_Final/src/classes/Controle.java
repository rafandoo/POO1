package classes;

public class Controle {

	//ATRIBUTOS
	private Lista_funcionarios prim;
	private Lista_funcionarios ult;
	private static int quantFuncionario = 0;
	
	//CONSTRUTOR
	public Controle() {
		this.prim = null;
		this.ult = null;
	}
	
	//GETTERS E SETTERS
	public Lista_funcionarios getPrim() {
		return prim;
	}
	public void setPrim(Lista_funcionarios prim) {
		this.prim = prim;
	}

	public Lista_funcionarios getUlt() {
		return ult;
	}
	public void setUlt(Lista_funcionarios ult) {
		this.ult = ult;
	}
	
	public static int getQuantFuncionario() {
		return quantFuncionario;
	}
	public static void setQuantFuncionario(int quantFuncionario) {
		Controle.quantFuncionario = quantFuncionario;
	}

	//METODOS
	public boolean ehvazio() {
		return (this.prim == null);
	}
	

	public void cadastrarFuncionario(Funcionario f) {
		Lista_funcionarios lf = new Lista_funcionarios(f);
		if(this.ehvazio()) {
			this.ult = lf;
		}
		lf.setProx(this.prim);
		this.prim = lf;
		Controle.quantFuncionario++;
	}
	
	public String pesquisarFuncionario(String nome) {
		@SuppressWarnings("unused")
		String msg = " ";
		Lista_funcionarios atual = this.prim;
		while((atual != null) && (!atual.getF().getNome().equals(nome))) {
			atual = atual.getProx();
		}
		return msg = "Nome: "+atual.getF().getNome()+"\n"+
					 "Matricula: "+atual.getF().getMatricula()+"\n"+
					 "Teste: " + atual.getF().mostraConta();
	}
	
	public String imprimirLista() {
		String msg = " ";
		if(this.ehvazio()) {
			msg="A lista está vazia!";
		} else {
			Lista_funcionarios atual = this.prim;
			while(atual != null) {
				msg +=  atual.getF().getNome() + " | " + atual.getF().getMatricula() + 
						" | " + atual.getF().mostraConta() + " | " + atual.getF().mostraEquip() +
						" | " + atual.getF().mostraCargoSetor() +
						"\n";
				atual = atual.getProx();
			}
		}
		return msg;
	}
	
}
