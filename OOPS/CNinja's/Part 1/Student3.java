
class Fraction{
    //properties 
    private int numerator;
    private int denominator;

    // constructors
    public Fraction(int numerator,int denominator){
        this.numerator = numerator;
        if (denominator == 0) {
            
        }
        this.denominator = denominator;
        simplyfy();
    }

    public int getDenominator(){
        return denominator;
    }
    public int getNumerator(){
        return numerator;
    }

    public void setNumerator(int n){
        this.numerator = n;
        simplyfy();
    }
    public void setDenominator(int d){
        if (d == 0) {
            return;
        }
        this.denominator = d;
        this.simplyfy();
    }

    // Printing function 
    public void Print(){
        if (denominator == 1) {
            System.out.print(numerator);
        }
        else{
            System.out.print(numerator + "/" + denominator);
        }
    }

    // This function is created to simplyfy the fraction number
    private void simplyfy(){

        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i < smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public static Fraction add(Fraction f1 , Fraction f2){
        int newnum = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int newden = f1.denominator * f2.denominator;
        Fraction f = new Fraction(newnum, newden);
        return f;
    }

    public void add(Fraction f2){
        this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplyfy();
    }

    public void multiply(Fraction f2){
        this.numerator = this.numerator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplyfy();
    }
}


public class Student3 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(24, 13);
        f1.Print();

        f1.setDenominator(9);
        int d = f1.getNumerator();
        System.out.println(d);
        f1.Print();
    }
}
