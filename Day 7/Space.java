public class Space{
    public static void main(String[] args){
        String statement = "Sahayam is my inter friend";
        int i=0,count=0;
        for(i=0;i<statement.length();i++){
            if(statement.charAt(i)==' '){
             count++;
            }
        }
        System.out.println("Number of spaces in the given staement is: "+count);
    }
}