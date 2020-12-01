
public class piramide {
	private double h,ab,apot,base,lateral,vol;
	private float plt=4.76f;
	private float tt1=127.90f,tt2=258.98f,tt3=344.34f;
	private double tt;
	
	
	public void setHaltura(double h){
		if(h>0) {
			this.h=h;
		}
		
	}
	public void setArestaBase(double ab) {
		if(ab>0) {
			this.ab=ab;
		}
	}
	
	public double setVolume() { 	//volume da piramide
		vol = (areaB()*h)/3;
		return vol;
	}
	
	public double apotema() {	//terorema de pitagoras
		//ab=Math.pow(ab, 2);
		//h=Math.pow(h, 2);
		apot = Math.sqrt((Math.pow(ab, 2)+Math.pow(h, 2))); 
		return apot;
	}
	
	public double areaB() {		//area da base
		base = Math.pow((ab*2), 2);
		return base;
	}
	
	public double areaL() {     //area total das faces laterais
		lateral = (apot*(ab*2))/2;
		lateral = lateral*4; 
		return lateral;
	}
	
	public double areaT() {		//area total da piramide
		double at = areaL()+areaB();
		return at;
	}
	
	public double setLitros() {
		double litr = areaT()/plt;
		return litr;
	}
	public int setQunlatas() {
		int qlatas = (int) (setLitros()/18)+1;
		return qlatas;
	}
	
	public double tipoTinta(int tt) {
		
		if((tt==1)||(tt==2)||(tt==3)) {
			if(tt==1) {
				this.tt=tt1*setQunlatas();
			}
			if(tt==2) {
				this.tt=tt2*setQunlatas();
			}
			if(tt==3) {
				this.tt=tt3*setQunlatas();
			}
		}
		return this.tt;
	}
		
	//https://brasilescola.uol.com.br/matematica/area-piramide.htm
}
