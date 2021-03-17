package classes;

public enum Setor {
	
	//ENUMS
	ADMINISTRACAO (1), VENDAS(2), ESTOQUE(3), FABRICACAO(4);
	
	//ATRIBUTO
	private final int cod;
	
	//CONSTRUTOR
	private Setor(int cod) {
		this.cod = cod;
	}
	
	//GETTER
	public int getCod() {
		return cod;
	}
}