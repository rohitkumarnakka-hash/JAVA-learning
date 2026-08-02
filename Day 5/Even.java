import java.util.Scanner;
public class Even{
 static void Odd(int num){
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    
    }
    public static void main(String[] args){
        System.out.println("Enter a number to check");
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        Odd(check);
        sc.close();
    }
}