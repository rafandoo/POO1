package composicao;

public class Main {

	public static void main(String[] args) {
		
		Pedido nv_p1 = new Pedido();
		nv_p1.setNum_movimento(1);
		nv_p1.setValorT(25.00);
		nv_p1.addItens("Fone de ouvido p2", 7895);
		nv_p1.addItens("Capinha celular", 5231);
		
		System.out.println(nv_p1);
	}

}
