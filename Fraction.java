public class Fraction{

	private int numerator, denominator;
	
	public Fraction(){
		numerator=1;
		denominator=1;
	}

	public Fraction (int n, int d){
		numerator=n;
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
	
	public static Fraction mult(Fraction a, Fraction b){
		int n=a.getNum()*b.getNum();
		int d=a.getDen()*b.getDen();
		return new Fraction(n,d);
	}
	
	/////
	
	public static Fraction reduce(Fraction f){
		int a=Math.max(f.getNum(),f.getDen);
		int b=Math.min(f.getNum(),f.getDen);
		while(a!=b){
			a=a-b;
			a=Math.max(a,b);
			b=Math.min(a,b);
		}
		return new Fraction(f.getNum()/a,f.getNum()/a);
	}
	
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
