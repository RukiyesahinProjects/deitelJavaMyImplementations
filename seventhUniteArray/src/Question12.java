public class Question12 {
    public static void main(String args[]){
        int[] counts = new int[10];

        for (int i =0; i < counts.length; i++){
            counts[i] = 0;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println("counts[" + i + "] = " + counts[i]);

        }
        int[] bonus = new int[15];

        for (int a =0; a < bonus.length; a++){
            bonus[a] = a +1;
        }

        for (int a = 0; a < bonus.length; a++) {
            System.out.println("bonus[" + a + "] = " + bonus[a]);
        }

        int[] bestScores = {95, 88, 76, 100, 85};

        for (int i =0; i < bestScores.length; i++){
            System.out.println(bestScores[i]);
        }
    }
}
