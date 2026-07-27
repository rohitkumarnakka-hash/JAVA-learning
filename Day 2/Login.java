import java.util.Scanner;
public class Login{
    public static void main(String[] args){
        String username;
        int password;
        System.out.println("Enter your username:");
        Scanner sc = new Scanner(System.in);
        username = sc.next();
        System.out.println("Enter your password:");
        password = sc.nextInt();
        if(username.equals("admin") && password == 1234){
            System.out.println("Login Successful");
        }else if(!username.equals("admin") && password == 1234){
            System.out.println("Invalid username");
        }
        else if(username.equals("admin") && password!= 1234){
            System.out.println("password incorrect");
        }
        else{
            System.out.println("Invalid username and password");
        }
        sc.close();
    }
}