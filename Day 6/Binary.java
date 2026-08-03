import java.util.Scanner;
public class Binary{
    public static void main(String[] args){
        int[] array = {1,2,3,45,7,8,9,10,22,33,44,55,66,77,88,99};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the target number to search:");
        int target = scan.nextInt();
        int first = 0;
        int last = array.length - 1;
        while(first <=last)
        {
          int mid = (first + last)/2; 
          if(array[mid] == target)
          {
            System.out.println("Target found at index:"+mid);
            break;
          }
          else if(array[mid] < target){
            first = mid + 1;
          }
          else{
            last = mid - 1;
          }
        }
        if(first > last){
            System.out.println("Target not found");
        }
        scan.close();

    }
}