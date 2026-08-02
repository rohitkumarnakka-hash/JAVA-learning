import java.util.Scanner;
public class Mine{
    static int square(int num){
        return num*num;
    }
    public static void main(String[] args){
        System.out.println("Enter a number to find its square");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = square(n);
        System.out.println(result);
        sc.close();
    }
}