import java.io.*;
import java.util.Scanner;

public class oddevencopy{
    public static void main(String args[]){
   
    try{
       FileReader fr=new FileReader("numbers.txt");
       Scanner sc=new Scanner(fr);
       FileWriter fr1=new FileWriter("even.txt");
       FileWriter fr2=new FileWriter("odd.txt");
       while(sc.hasNextInt()){
        int num=sc.nextInt();
        if(num%2==0){
            fr1.write(num+"\n");
        }
        else{
            fr2.write(num+"\n");
        }
       }

       sc.close();
       fr.close();
       fr1.close();
       fr2.close();

       System.out.println("copied successfully");
       

    }
    catch (IOException e) 
    {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
    
}


