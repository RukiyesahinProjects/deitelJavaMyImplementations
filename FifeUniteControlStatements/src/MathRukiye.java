public class MathRukiye {
    /**
     * This method takes two integers and returns their sum.
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public  int sum(int a, int b) {


        return a + b;
    }
    public static String randomString(int a, int b){
        int value;
        String output = "";
        for (int i = 1; i <= 20 ; i++) {
            value = a + (int)(Math.random() * (b - a + 1));
            output += value + " ";

            if (i%5 ==0){
                output += "\n";
            }
        }
        return output;
    }
    public static String RollDice(int a, int b){
        int frequency1 =0;
        int frequency2 =0;
        int frequency3 =0;
        int frequency4 =0;
        int frequency5 =0;
        int frequency6 =0;
        int value;
        String output = "";

        for (int i = 1; i <= 100 ; i++) {
            value = a + (int)(Math.random() * (b - a + 1));
            switch (value){
                case 1:
                    frequency1++;
                    break;
                case 2:
                    frequency2++;
                    break;
                case 3:
                    frequency3++;
                    break;
                case 4:
                    frequency4++;
                    break;
                case 5:
                    frequency5++;
                    break;
                case 6:
                    frequency6++;
                    break;
            }
        }
        return output = "1: " + frequency1 + "\n" +
                "2: " + frequency2 + "\n" +
                "3: " + frequency3 + "\n" +
                "4: " + frequency4 + "\n" +
                "5: " + frequency5 + "\n" +
                "6: " + frequency6;
    }


    /**
     * This method takes two integers and returns their difference.
     * @param a the first integer
     * @param b the second integer
     * @return the difference of a and b
     */
    public static int max(int a, int b, int c){

        if(a>=b && a>=c){
            return a;
        } else if (b>=a && b>=c) {
            return b;
        } else {
            return c;
        }
    }
    /**
     * This method takes three integers and returns the minimum of the three.
     */

    public static int min(int a, int b, int c){
        if(a<=b && a<=c){
            return a;
        } else if (b<=a && b<=c) {
            return b;
        }else {
            return c;

        }

    }
    public static double hypotenuse(double a, double b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    public static int smallest (int x, int y, int z){
        int smallsetnumber = x;
        if (y <= smallsetnumber) {
            smallsetnumber = y;
        }
        if (z <= smallsetnumber) {
            smallsetnumber = z;
        }
        return smallsetnumber;
    }
    public static void main(String[] args){
        int min = smallest(1,2,4);
        System.out.println("Smallest number: " + min);

        double longside = hypotenuse(3,4);
        System.out.println("Uzun kenar: " + longside);
        double x = Math.abs(7.5);
        System.out.println(x);

        double parkFee = calculateCharge(5);
        System.out.println("Odemeniz gereken para: " + parkFee);


        System.out.println(new int[]{2,4,6,8,10}[(int)(Math.random() * 5)]);
        System.out.println(new int[]{1,3,5,7,9}[(int)(Math.random() * 5)]);

        double alan = circleArea(6);
        System.out.println("dairenin alani: " + alan );
    }
    public static float intToFloat(int number){
        return (float) number;
    }
    public static double calculateCharge(int hours){
        double charge =0;
        if (hours <= 3) {
            charge = 2;
        }
        if (hours > 3){
            double newHours = hours - 3;
            charge = 2 + newHours * 0.5;
        }
        if (hours == 24){
            charge = 10;
        }
        return charge;
    }
    public static int integerPower(int base, int exponent){
        int result = 1;
        for (int i = 1; i <= exponent ; i++) {
            result *= base;
        }
        return result;
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static double circleArea(double radius){
        return Math.PI * Math.pow(radius,2);
    }

}
