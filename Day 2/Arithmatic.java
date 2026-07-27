import java.util.Scanner;
public class Arithmatic{
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter the the inputs");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Addition is :" +(a+b));
        System.out.println("Subtraction is :" +(a-b));
        System.out.println("Multiplication is:"+(a*b));
        System.out.println("Division is:"+(a/b));
        sc.close();
    }
}