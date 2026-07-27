import java.util.Scanner;

public class Postive{
    public static void main(String[] args){

        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){
            System.out.println(num + " is a positive number");
        }
        else if(num<0){
            System.out.println(num+"is a negative number");
        }
 
        sc.close();
        }
    }
