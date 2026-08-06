public class Case{
    public static void main(String[] args){
        String character = "Sahayam is CSE student";
        int i,upper=0,lower=0,others=0;
        for(i=0;i<character.length();i++){
            if(character.charAt(i)>='a' && character.charAt(i)<='z'){
                lower++;
            }
            else if(character.charAt(i)>='A' && character.charAt(i)<='Z'){
                upper++;
            }
            else{
                others++;
            }
        }
        System.out.println("Uppercase letters in the given statement is: "+upper);
        System.out.println("Lowercase letters in the given statement is: "+lower);
        System.out.println("Other than characters in the staement is: "+others);
    }
}
