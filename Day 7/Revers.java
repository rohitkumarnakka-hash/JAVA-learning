public class Revers{
    public static void main(String[] args){
        String name = "Rohit";
        int i;
        String reverse="";
        for(i=0;i<name.length();i++){
            reverse=reverse+name.charAt(name.length()-1-i);
        }
        System.out.println("Name before reversing is: "+name);
        System.out.println("Name after reversing is: "+reverse);
    }
}