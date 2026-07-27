import java.util.Scanner;
public class largest {
    public static void main(String[] args){
        int a, b, c;
        System.out.println("Enter the three numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b&&a>c){
            System.out.println("The largest number is: "+a);
        }else if(b>a && b>c){
            System.out.println("The largest number is: "+b);
        }else{
            System.out.println("The largest number is:"+c);
        }
        sc.close();
    }
    
}
