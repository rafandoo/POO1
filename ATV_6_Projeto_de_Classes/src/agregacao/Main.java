package agregacao;

public class Main {

	public static void main(String[] args) {
		
		Componentes c1 = new Componentes("I9-10500", "8GB");
		Componentes c2 = new Componentes("I3-9600", "4GB");
		
		Computador comp = new Computador();
		comp.setModelo("Asus");
		comp.addComponente(c1);
		comp.addComponente(c2);
		
		System.out.println(comp);

	}

}
