
public class Controle {

	//ATRIBUTOS
	private Nodo prim;
	private Nodo ult;
	private static int quantFuncionario = 0;
	
	//CONSTRUTOR
	public Controle() {
		this.prim = null;
		this.ult = null;
	}
	
	//GETTERS E SETTERS
	public Nodo getPrim() {
		return prim;
	}
	public void setPrim(Nodo prim) {
		this.prim = prim;
	}

	public Nodo getUlt() {
		return ult;
	}
	public void setUlt(Nodo ult) {
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
		Nodo nnodo = new Nodo(f);
		if(this.ehvazio()) {
			this.ult = nnodo;
		}
		nnodo.setProx(this.prim);
		this.prim = nnodo;
		Controle.quantFuncionario++;
	}
	
	public String pesquisarFuncionario(String nome) {
		String msg ="";
		Nodo atual = this.prim;
		while((atual != null) && (!atual.getF().getNome().equals(nome))) {
			atual = atual.getProx();
		}
		return msg = "Nome: "+atual.getF().getNome()+"\n"+
					 "Matricula: "+atual.getF().getMatricula()+"\n"+
					 "Teste: " + atual.getF().mostraConta();
	}
	
	public String imprimirLista() {
		String msg ="";
		if(this.ehvazio()) {
			msg="A lista está vazia!";
		} else {
			Nodo atual = this.prim;
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
