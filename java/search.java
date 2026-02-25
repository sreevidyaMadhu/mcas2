import java.util.Scanner;

public class search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int size=sc.nextInt();
        System.out.println("enter the array elements:");
        int []A=new int[size];
        for(int i=0;i<size;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("enter the element to search:");
        int key=sc.nextInt();
        int pos=-1;
        for(int i=0;i<size;i++){
            if(A[i]==key){
                pos=i;
                break;
            }
        }
        if(pos!=-1){
            System.out.println("element found at:"+(pos+1));

        }
        else{
            System.out.println("element not found");
        }
    }
}
