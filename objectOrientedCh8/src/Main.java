// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(4,5);
        ComplexNumber c2 = new ComplexNumber(1,3);
        Rational r1 = new Rational(2,4);
        Rational r2 = new Rational(3,5);
        Rational addition = r1.add(r2);
        Rational subtruction = r1.subt(r2);
        Rational multiple = r1.mul(r2);
        Rational divide = r1.div(r2);
        TimeTest t1 = new TimeTest(29,59,23);
        BankAccount b1 = new BankAccount(1234, "Rukiye", 1250);
        System.out.println("Bank Account: " + b1);
        int time = t1.checkDay(30);
         int time1 = t1.nextDay();
         int time2 = t1.nextHour();
         int time3 = t1.nextMinute();

         b1.deposit(500);
         b1.withdraw(200);
         b1.transfer(b1,200);
        System.out.println(b1);


        ComplexNumber sum = c1.add(c2);
        ComplexNumber sub = c1.sub(c2);

        System.out.println("First complex number" + c1);
        System.out.println("Second complex number: " + c2);
        System.out.println("sum: " + sum);
        System.out.println("sub: " + sub);
        System.out.println("First Rational number: " + r1);
        System.out.println("second Rational number: " + r2);
        System.out.println("sum: " + addition );
        System.out.println("subtruction: " + subtruction);
        System.out.println("multiple: " + multiple);
        System.out.println("divide: " + divide);
        System.out.println("day: " + time1);
        System.out.println("minute: " + time3);
        System.out.println("hour: " + time2);



    }
}