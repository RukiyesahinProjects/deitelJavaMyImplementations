import java.security.PublicKey;

public class ComplexNumber {

    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(){
        this.realPart = 0;
        this.imaginaryPart = 0;
    }
    public ComplexNumber(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public ComplexNumber(ComplexNumber other){
        this.realPart = other.realPart;
        this.imaginaryPart = other.imaginaryPart;
    }
    public ComplexNumber add(ComplexNumber other){
        return new ComplexNumber(this.realPart + other.realPart, this.imaginaryPart + other.imaginaryPart);
    }
    public ComplexNumber sub(ComplexNumber other){
        return  new ComplexNumber(this.realPart - other.realPart, this.imaginaryPart - other.imaginaryPart);
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public String toString(){
        if (imaginaryPart >= 0){
            return realPart + " + " + imaginaryPart + "i";
        }else {
            return realPart + " - " + (-imaginaryPart) + "i";
        }
    }
}
