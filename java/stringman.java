import java.util.Scanner;
public class stringman {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("enter a string:");
        str=sc.nextLine();
        int len=str.length();
        System.out.println("string length:"+len);
        System.out.println("in uppercase:"+str.toUpperCase());
        System.out.println("in lowercase:"+str.toLowerCase());
        System.out.println("character at 4:"+str.charAt(3));
        String concat;
        System.out.println("enter string to concatenate:");
        concat=sc.nextLine();
        System.out.println("string after concatination:"+str+concat);
        System.out.println("enter:");
        

    }
    
}
