public class Bubble{
    public static void main(String[] args){
        int temp;
        int[] array = {45,34,76,12,99,56,37,77,28,72,55,70,69};
        System.out.println("Array before sorting:");
        for(int i = 0; i<array.length;i++){
            System.out.print(array[i] + "  ");
        }
        for(int i = 0;i<array.length;i++){
         for(int j = i+1;j<array.length;j++){
            if(array[i]>array[j]){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
         }
        }
        System.out.println("Array after sorting:");
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i] + "  ");
        }

    }
}