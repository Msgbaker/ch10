import java.util.Scanner;

public class FractionQuiz{
	public static void main(String[] arg){
		Scanner in= new Scanner(System.in);
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction();
		Fraction quiz = Fraction.question(f1,f2);
		System.out.println(quiz);
		Fraction ans = new Fraction(in.nextLine());
		
	}
}
