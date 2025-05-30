public class RollDieArray {
    public static void main(String args[]){
        int frequency[] = new int[7];

        for (int roll = 1; roll <= 6000 ; roll++)
            ++frequency[1 + (int)(Math.random() * 6)];

            String output = "Face\tFrequency";

        for (int face = 1; face < frequency.length; face++)
            output += "\n" + face + "\t\t\t" + frequency[face];

        System.out.println(output);


    }
}
