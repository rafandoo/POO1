
public class Controle {

	//ATRIBUTOS
	private Nodo prim;
	private Nodo ult;
	private int quantNodo;
	
	//CONSTRUTOR
	public Controle() {
		this.prim = null;
		this.ult = null;
		this.quantNodo = 0;
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
	
	public int getQuantNodo() {
		return quantNodo;
	}
	public void setQuantNodo(int quantNodo) {
		this.quantNodo = quantNodo;
	}

	//METODOS
	public boolean ehvazio() {
		return (this.prim == null);
	}
	
	public void inserirPrim(Funcionario f) {
		Nodo nnodo = new Nodo(f);
		if(this.ehvazio()) {
			this.ult = nnodo;
		}
		nnodo.setProx(this.prim);
		this.prim = nnodo;
		this.quantNodo++;
	}
	
	public void inserirult(Funcionario f) {
		Nodo nnodo = new Nodo(f);
		if(this.ehvazio()) {
			this.prim = nnodo;
		} else {
			this.ult.setProx(nnodo);
		}
		this.ult = nnodo;
		this.quantNodo++;
	}
	
	public boolean removerNodo(String nome) {
		Nodo atual = this.prim;
		Nodo ant = null;
		if(this.ehvazio()) {
			return false;
		} else {
			while((atual != null)&&(!atual.getF().getNome().equals(nome))) {
				ant = atual;
				atual = atual.getProx();
			}
			if(atual == this.prim) {
				if(this.prim == this.ult) {
					this.ult = null;
				}
				this.prim = this.prim.getProx();
			} else {
				if(atual == this.ult) {
					this.ult = ant;
				}
				ant.setProx(atual.getProx());
			}
			this.quantNodo--;
			return true;
		}
	}
	
	public String pesquisarNodo(String nome) {
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
						"\n";
				atual = atual.getProx();
			}
		}
		return msg;
	}
	
}
