import java.util.Scanner;

public class Largest{

    static void Large(int n1, int n2, int n3){
        if(n1 > n2 && n1 > n3)
        {
            System.out.println("Largest number is "+n1);
        }
        else if(n2 > n1 && n2 > n3){
            System.out.println("Largest number is: "+n2);
        }
        else{
            System.out.println("Largest number is: "+n3);
        }
    }
    public static void main(String[] args){
        System.out.println("Enter three numbers to check largest number");
        Scanner l = new Scanner(System.in);
        int number1 = l.nextInt();
        int number2 = l.nextInt();
        int number3 = l.nextInt();
        Large(number1,number2,number3);
        l.close();
    }
}