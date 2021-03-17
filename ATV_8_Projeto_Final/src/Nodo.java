
public class Nodo {

		private Funcionario f;
		private Nodo prox;
		
		public Nodo(Funcionario f) {
			this.f = f;
			this.prox = null;
		}
		
		public Funcionario getF() {
			return f;
		}
		public void setF(Funcionario f) {
			this.f = f;
		}
		
		public Nodo getProx() {
			return prox;
		}
		public void setProx(Nodo prox) {
			this.prox = prox;
		}
	}
