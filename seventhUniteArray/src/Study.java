import java.util.Arrays;
import java.util.Scanner;

public class Study {

    public static double ortalama (int[] array){
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        return ((double) toplam / array.length);
    }
    public static void array_bastir(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element "+(i+1)+ " : " + array[i]);
        }
    }
    public static void arrayiSirala(int[] array){
        Arrays.sort(array);
    }
    public static int[] arrayiDoldur(int sayi){
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int[sayi];

        for (int i = 0; i < sayi; i++) {
            cikti[i] = scanner.nextInt();
        }
        return cikti;
    }

    public static void main(String[] args){
       // int[] a = arrayiDoldur(5);
        int[] b = {1,2,3,4,5};
        int[] c = {1,2,3,4,5};

        /*System.out.println("**************");
        arrayiSirala(a);
        array_bastir(a);*/

        if (Arrays.equals(b,c)){
            System.out.println("esit");
        }else {
            System.out.println("esit degil");
        }



    }
}
