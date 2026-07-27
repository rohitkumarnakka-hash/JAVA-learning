import java.util.Scanner;
public class Case{
    public static void main(String[] args){
       char ch;
        Scanner st = new Scanner(System.in);
        System.out.println("Enter a character: ");
        ch = st.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println(ch+" is an uppercase character");
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " is a lower case character");
        }
        else{
            System.out.println(ch + " is not an alphabet");
        }
        st.close();
    }

}
