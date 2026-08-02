import java.util.Scanner;
public class Addition{
    static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println("Enter two numbers to add: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = add(num1 , num2);
        System.out.println(result);
        sc.close();
    }
}