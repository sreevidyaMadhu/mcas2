
import java.util.*;

public class sort {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of strings:");
        int n=sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr);

        System.out.println("Sorted strings:");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
    
