public class Fraction{

	private int numerator, denominator;
	
	public Fraction(){
		numerator=1;
		denominator=1;
	}

	public Fraction (int n, int d){
		setNum(n);
		setDen(d);
	}
	//////////
	public String toString(){
		return numerator + "/" + denominator;
	}
	
	public double toDouble(){
		return (double)numerator/(double)denominator;
	}
	
	public int getNum(){
		return numerator;
	}
	
	public int getDen(){
		return denominator;
	}
	
	public int GCF(){
		//System.out.println(numerator+" () " +denominator);
		int a=Math.max(numerator,denominator);
		int b=Math.min(numerator,denominator);
		while(a!=b){ 
			System.out.println(a + " () " + b);
			a=a-b;
			a=Math.max(a,b);
			b=Math.min(a,b);
		}
		System.out.println("the big a " + a);
		return a;
	}
	
	//////////////////
	
	public static Fraction mult(Fraction a, Fraction b){
		int n=a.getNum()*b.getNum();
		int d=a.getDen()*b.getDen();
		return new Fraction(n,d);
	}
	
	public static Fraction reduce(Fraction f){
		int n=0;
		int d=0;
		int gcf=f.GCF();

		if(gcf>0){
			n=f.getNum()/gcf;
			d=f.getDen()/gcf;
		} else{
			n=f.getNum();
			d=f.getDen();
			System.out.println("Can't be reduced");
		}
		return new Fraction(n,d);
	}
	
	/////
	
	public void setNum(int n){
		numerator=n;
	}
	
	public void setDen(int d){
		if(d!=0){
			denominator=d;
		}else{
			denominator=1;
			System.err.println("Denominator can't be zero");
		}
	}
}
