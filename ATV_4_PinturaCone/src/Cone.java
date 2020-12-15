import java.text.DecimalFormat;
public class Cone {
	
	//----------------------------ATRIBUTOS
	private double h,r;
	private int tt;
	private final float pi = 3.14f;

	//----------------------------CONSTRUTORES
	public Cone() {
		
	}
	
	public Cone(int tt) {
		setTt(tt);
	}
	
	public Cone(double r) {
		setR(r);
	}
	
	public Cone(double r, double h) {
		setR(r);
		setH(h);
	}
	
	public Cone(double r, int tt) {
		setR(r);
		setTt(tt);
	}
	
	public Cone(double r, double h, int tt) {
		setR(r);
		setH(h);
		setTt(tt);
	}

	//---------------------------SETTERS E GETTERS
	public void setR(double r) {
		if(r>0) {
			this.r = r;
		}
	}
	public double getR() {
		return r;
	}
	
	public void setH(double h) {
		if(h>0) {
			this.h = h;
		}
	}
	public double getH() {
		return h;
	}
	
	public int getTt() {
		return tt;
	}
	public void setTt(int tt) {
		if ((tt>0)&&(tt<=3)) {
			this.tt = tt;
		}
	}
	
	//--------------------------------FUNCOES
	public double areaB() {
		return (pi*Math.pow(r, 2));
	}
	
	public double areaL() {
		return (pi*r*geratriz());
	}
	
	public double areaT() {
		return (pi*r*(r+geratriz()));
	}
	
	public double geratriz() {
		return (Math.sqrt((Math.pow(r, 2)+Math.pow(h, 2))));
	}
	
	public double quantLitros() {
		return (areaT()*3.45);
	}
	
	public int quantLatas() {
		return (int) (Math.ceil(quantLitros()/18));
	}
	
	public float preco() {
		if (getTt()==1) {
			return (238.90f);
		} else if (getTt()==2) {
			return (467.98f);
		} else {
			return (758.34f);
		}
	}
	
	public String precoT() {
		return(arredondar(preco()*quantLatas()));
	}
	
	private String arredondar(double n) {
		return (new DecimalFormat("#,##0.00").format(n));
	}
	
	//------------------------------SAIDA
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n=== Pintura Cone ===");
		builder.append("\nAltura: ");
		builder.append(h);
		builder.append("\nRaio: ");
		builder.append(r);
		builder.append("\nTipo de Tinta: ");
		builder.append(tt);
		builder.append("\nGeratriz: ");
		builder.append(geratriz());
		builder.append("\nArea da base: ");
		builder.append(areaB());
		builder.append("\nArea lateral: ");
		builder.append(areaL());
		builder.append("\nArea total do cone: ");
		builder.append(areaT());
		builder.append("\nLitros: ");
		builder.append(quantLitros());
		builder.append("\nLatas: ");
		builder.append(quantLatas());
		builder.append("\nPreco unitario: R$ ");
		builder.append(preco());
		builder.append("\nPreco total: R$ ");
		builder.append(precoT());
		return builder.toString();
	}	
}