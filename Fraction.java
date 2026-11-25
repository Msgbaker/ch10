import java.util.Random;

public class Fraction {
    private int numerator, denominator, gcf;
	Random rand= new Random();
    public Fraction() {
        numerator = rand.nextInt(0,9)+1;
        denominator = rand.nextInt(0,9)+1;
    }

    public Fraction(int n, int d) {
        setNum(n);
        setDen(d);
    }
    //////////
    public String toString() {
        return numerator + "/" + denominator;
    }

    public double toDouble() {
        return (double) numerator / (double) denominator;
    }

    public int getNum() {
        return numerator;
    }

    public int getDen() {
        return denominator;
    }

    public int GCF() {
        int a = Math.max(numerator, denominator);
        int b = Math.min(numerator, denominator);
        int temp = 0;
        while (a != b) {
            temp = a - b;
            a = Math.max(temp, b);
            b = Math.min(temp, b);
        }
        return a;
    }

    //////////////////

	public static Fraction question(Fraction a, Fraction b){
	}
	
    public static Fraction mult(Fraction a, Fraction b) {
        int n = a.getNum() * b.getNum();
        int d = a.getDen() * b.getDen();
        return new Fraction(n, d);
    }

    public static Fraction divide(Fraction a, Fraction b) {
        int n = a.getNum() * b.getDen();
        int d = a.getDen() * b.getNum();
        return new Fraction(n, d);
    }

    public static Fraction sub(Fraction a, Fraction b) {
        int d = a.getDen() * b.getDen();
        int n = a.getNum() * b.getDen() - b.getNum() * a.getDen();
        return new Fraction(n, d);
    }

    public static Fraction sum(Fraction a, Fraction b) {
        int d = a.getDen() * b.getDen();
        int n = a.getNum() * b.getDen() + b.getNum() * a.getDen();
        return new Fraction(n, d);
    }

    public static Fraction reduce(Fraction f) {
        int n = 0;
        int d = 0;
        int gcf = f.GCF();
        if (gcf > 0) {
            n = f.getNum() / gcf;
            d = f.getDen() / gcf;
        } else {
            n = f.getNum();
            d = f.getDen();
            System.out.println("Can't be reduced");
        }
        return new Fraction(n, d);
    }

    /////

    public void setNum(int n) {
        numerator = n;
    }

    public void setDen(int d) {
        if (d != 0) {
            denominator = d;
        } else {
            denominator = 1;
            System.err.println("Denominator can't be zero");
        }
    }
}
