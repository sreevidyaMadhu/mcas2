import calculator.Add;
import java.util.Scanner;

public class packagedemo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Add ab=new Add();
        System.out.println("Sum="+ab.sum(a,b));
    }
}
