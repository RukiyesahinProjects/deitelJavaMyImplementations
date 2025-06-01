public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational() {
        this.numerator = 0;

    }

    public Rational add(Rational other){
        if (denominator == other.denominator){
            return new Rational(this.numerator + other.numerator, this.denominator);
        }else {
            return new Rational(this.numerator * other.denominator + other.numerator * this.denominator, this.denominator * other.denominator);
        }
    }

    public Rational subt(Rational other){
        if (denominator == other.denominator){
            return new Rational(this.numerator - other.numerator, this.denominator);
        }else {
            return new Rational(this.numerator * other.denominator - other.numerator * this.denominator, this.denominator * other.denominator);
        }
    }
    public Rational mul(Rational other){
        return new Rational(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public Rational div(Rational other){
        return new Rational(this.numerator * other.denominator, other.numerator * this.denominator);
    }

    public Rational(Rational other){
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }

    @Override
    public String toString() {
        if (denominator > 0){
            return numerator + " / " + denominator;
        }
        return numerator + " / " + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
