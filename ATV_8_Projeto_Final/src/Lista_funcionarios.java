
public class Lista_funcionarios {

		private Funcionario f;
		private Lista_funcionarios prox;
		
		public Lista_funcionarios(Funcionario f) {
			this.f = f;
			this.prox = null;
		}
		
		public Funcionario getF() {
			return f;
		}
		public void setF(Funcionario f) {
			this.f = f;
		}
		
		public Lista_funcionarios getProx() {
			return prox;
		}
		public void setProx(Lista_funcionarios prox) {
			this.prox = prox;
		}
	}
