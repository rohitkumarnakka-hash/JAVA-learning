public class Reverse{
    public static void main(String[] args){
        int[] array = {23,43,45,54,65,57,76,68,87,89,99,77};
        System.out.println("Original Array:");
        for(int i = 0; i< array.length;i++){
            System.out.print(array[i] + "  ");
        }
        System.out.println("\nReversed array:");
        for(int i =array.length - 1; i>=0;i--){
            System.out.print(array[i] + "  ");
        }

    }
}