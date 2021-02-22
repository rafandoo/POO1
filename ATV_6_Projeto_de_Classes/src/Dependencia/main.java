package Dependencia;

public class main {

	public static void main(String[] args) {

		Lampada lamp = new Lampada();
		lamp.setPotencia(10);
		
		Interruptor intr = new Interruptor();
		
		intr.ligarInterp(lamp);
		System.out.println(intr);

	}

}
