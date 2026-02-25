import java.util.Scanner;
public class symmetric 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int r,c,count=0;
    System.out.println("Enter the number of rows and cols:");
    r=sc.nextInt();
    /*System.out.println("Enter the number of columns:");
    c=sc.nextInt();*/
    int [][] A=new int[r][r];
    System.out.println("enter the elements of matrix:");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<r;j++)
        {
            A[i][j]=sc.nextInt();
            
        }
    }
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<r;j++)
        {
            if(A[i][j]==A[j][i])
            {
                count++;
            }
        }
    }
    if(count==(r*r))
    {
        System.out.println("Matrix is symmetic");
    }
    else{
        System.out.println("Matrix is not symmetric");
    }
    
}
}

