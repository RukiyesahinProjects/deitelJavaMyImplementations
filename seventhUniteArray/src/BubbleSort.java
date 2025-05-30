public class BubbleSort {
    public static void main(String args[]){
        int array[] = {2,98,5,7,9,23,14,1,27,77};

        System.out.println("Current Array elements");

        for (int counter = 0; counter < array.length; counter++)
            System.out.print(" " + array[counter]);
        bubbleSort(array);
        System.out.println();
        for (int counter = 0; counter < array.length; counter++)
            System.out.print(" " + array[counter]);
    }
    public static void bubbleSort(int array2[]){
        for (int pass =1; pass < array2.length; pass++){
            for (int element = 0; element < array2.length - pass; element++){

                if (array2[element] > array2[element + 1])
                    swap(array2, element, element+1);
            }
        }
    }
    public static void swap(int array3[], int first, int second){
        int hold;
        hold = array3[first];
        array3[first] = array3[second];
        array3[second] = hold;
    }
}
