public class Fraction{

	private int numerator, denominator;
	
	public Fraction(){
		numerator=1;
		denominator=1;
	}

	public Fraction (int n, int d){
		numerator=n;
		if(d!=0){
			denominator=d;
		}else{
			denominator=1;
			System.err.println("Denominator can't be zero");
		}
	}

}
