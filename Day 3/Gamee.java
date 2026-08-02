import java.util.Scanner;
public class Gamee{
    public static void main(String[] args){
        int random = 99;
        int attempts = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to guess between 1 to hundred");
        int guess = sc.nextInt();
        while(guess != random){
            if(guess < 95){
                System.out.println("Your guess is wrong,try again");
                guess = sc.nextInt();
                attempts++;
            }
            else if(guess > 95 && guess <100){
                System.out.println("You are very close to number,try again");
                guess = sc.nextInt();
                attempts++;
            }
            else{
                System.out.println("You are not in the range,try again");
                guess = sc.nextInt();
                attempts++;
            }
        }
        System.out.println("Congratulations! You guessed the number in "+attempts+ "attempts");
      sc.close();  
    }
}