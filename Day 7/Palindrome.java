public class Palindrome{
    public static void main(String[] args){
        String str = "RACECAR";
        int check=1;
        int i=0;
        for(i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                check=1;
            }
            else{
                check=0;
            }
        }
        if(check==1){
            System.out.println("Given string is palindrome");
        }
        else{
            System.out.println("Given string is not a palindrome");
        }
    }
}