public class Vowels{
    public static void main(String[] args){
        String name = "Kumar";
        int count = 0;
        for(int i = 0;i<name.length();i++){
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'||name.charAt(i)=='A'||name.charAt(i)=='E'||name.charAt(i)=='I'||name.charAt(i)=='O'||name.charAt(i)=='U'){
                count=count+1;
            }
            
    }
        System.out.println("Number of vowels in the string is "+count);
    }
}