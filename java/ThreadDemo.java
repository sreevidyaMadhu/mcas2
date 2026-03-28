import java.util.*;
class multiple5 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i+" * 5 = "+(i*5));
        }
    }
}
class prime extends Thread{
    int n;
    prime(int limit){
        n=limit;
    }
    int isprime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            return 0;
        }
        return 1;
    }
    public void run(){
        for(int i=1;i<=n;i++){
            if(isprime(i)==1)
            System.out.println("prime: "+i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        multiple5 m=new multiple5();
        System.out.println("enter limit for generating prime:");
        int n=sc.nextInt();
        prime m1=new prime(n);
        m.start();
        m1.start();

    }
}
