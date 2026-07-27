import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        double r;
        System.out.println("Enter the radius of circle");
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        System.out.println("Area of the circle is:"+(3.14*r*r));
        sc.close();
    }
}

