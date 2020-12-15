
public class main {

	public static void main(String[] args) {
		
		Cone c1 = new Cone();
		c1.setH(8);
		c1.setR(6);
		c1.setTt(1);
		System.out.println(c1);
		
		Cone c2 = new Cone(3.5);
		c2.setH(9.0);
		c2.setTt(2);
		System.out.println(c2);
		
		Cone c3 = new Cone(2);
		c3.setR(20.0);
		c3.setR(13.9);
		System.out.println(c3);
		
		Cone c4 = new Cone(37.78,16.53);
		c4.setTt(3);
		System.out.println(c4);
		
		Cone c5 = new Cone(10.0,2);
		c5.setH(7.89);
		System.out.println(c5);
		
		Cone c6 = new Cone(18.7,23.8,3);
		System.out.println(c6);
	}

}
