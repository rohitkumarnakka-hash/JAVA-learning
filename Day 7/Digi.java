public class Digi{
    public static void main(String[] args){
        String str = "Rithvik12345";
        int i=0,count=0;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9'||str.charAt(i)=='0'){
                count++;
            }
        }
        System.out.println("Number of digits in a string is "+count);
    }
}