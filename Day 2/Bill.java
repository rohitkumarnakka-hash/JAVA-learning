import java.util.Scanner;
public class Bill{
    public static void main(String[] args){
        double units,bill;
        System.out.println("Enter the number of units consumed:");
        Scanner sc = new Scanner(System.in);
        units = sc.nextDouble();
        if(units<=100){
            bill = units*2.5;
        }else if(units>100 && units<=200){
            bill = units*3.4;
        }else if(units>200 && units<=300){
            bill = units*4.2;
        }else{
            bill = units*5.0;
        }
        System.out.println(bill + " is total bill for " + units + "units");
        
        sc.close();
    }
}