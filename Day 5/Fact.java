import java.util.Scanner;
public class Fact{
    static void fct(int num){
        int result =1;
        for(int i =1;i<=num;i++){
    
            result = result*i;
        }
        System.out.println("Factorial of " +num+" is: "+result);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to print factorial");
        int number = scan.nextInt();
        fct(number);
        scan.close();
    }
}