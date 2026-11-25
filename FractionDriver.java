public class FractionDriver{
	public static void main(String[] arg){
		Fraction f1= new Fraction(3,4);
		Fraction f2 = new Fraction(1,8);
		Fraction f3 = Fraction.sum(f1,f2);
		Fraction f4 = Fraction.reduce(f3);
		System.out.println(f4);
	}
}
