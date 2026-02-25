
public class product 
{
    int pcode;
    String pname;
    int price;
    void data(int c,String n,int p)
    {
        pcode=c;
        pname=n;
        price=p;
    }
    void display()
    {
        System.out.println("code="+pcode);
        System.out.println("name="+pname);
        System.out.println("price="+price);
    }
    void compare(int price1,int price2,int price3,String n1,String n2,String n3)
    {
        if((price1<price2) && (price1<price3) )
        {
            System.out.println(n1+"has the lowest price");
            
           
        }
        else if((price2<price1) && (price2<price3) )
        {
            System.out.println(n2+" has the lowest price");
        }
        else{
            System.out.println(n3+" has the lowest price");
        }
    }

    public static void main(String args[])
    {
        product obj1=new product();
        product obj2=new product();
        product obj3=new product();
        obj1.data(101,"Sreekanth",500);
        obj2.data(102,"Sreeshanth",300);
        obj3.data(103,"Sreenath",700);
        obj1.display();
        obj2.display();
        obj3.display();
        obj1.compare(obj1.price,obj2.price,obj3.price,obj1.pname,obj2.pname,obj3.pname);
    }
    
}