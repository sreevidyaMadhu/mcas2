
import java.util.Scanner;

public class multilevel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        genre g = new genre();

        g.readBook(sc);        
        g.readPublisher(sc); 
        g.readGenre(sc);   
        g.displayGenre();
    }
    
}
class book{
    String bname;
    int price;

    void readBook(Scanner sc) {
        System.out.print("Enter Book name: ");
        bname = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextInt();
        sc.nextLine();
    }
    void displayBook() {
        System.out.println("Book Name: " + bname);
        System.out.println("Price: " + price);
    }
}
class publisher extends book{
    String pname;

    void readPublisher(Scanner sc) {
        System.out.print("Enter Publisher name: ");
        pname = sc.nextLine();
    }
    void displayPublisher() {
        displayBook();
        System.out.println("Book Publisher: " + pname);
    }
}
class genre extends publisher{
    String gen;
    void readGenre(Scanner sc){
       System.out.print("Enter Genre: ");
        gen=sc.nextLine(); 
    }
    void displayGenre() {
        displayPublisher();
        System.out.print("Book Genre: " + gen);
    }
}

