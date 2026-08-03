public class Selection{
    public static void main(String[] args){
        int[] array = {45,34,76,12,99,54,34,9,7,75,77,99,121};
        System.out.println("Array before sorting:");
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i] + "  ");
        }
        for(int i = 0; i<array.length;i++){
            int min = i;
            for(int j = i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        System.out.println("\nArray after sorting:");
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i] + "  ");
        }
    }
}