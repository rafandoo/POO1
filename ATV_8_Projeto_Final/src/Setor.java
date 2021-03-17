
public enum Setor {
	
	//ENUMS
	ADMINISTRACAO (1), VENDAS(2), ESTOQUE(4), FABRICACAO(5);
	
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