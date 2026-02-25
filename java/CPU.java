public class CPU
{
    int price;
    class Processor
    {
        int cores;
        String manufacturer;
        Processor(int a, String b)
        {
            cores=a;
            manufacturer=b;
        }
        void display()
        {
            System.out.println("Processor info");
            System.out.println("Number of cores="+cores);
            System.out.println("Name of manufacturer="+manufacturer);
        }
    }
    static class ram
    {
        int memory;
        String man;
        ram(int c,String d)
        {
            memory=c;
            man=d;
        }
        void display()
        {
            System.out.println("RAM info");
            System.out.println("Memory size="+memory+"GB");
            System.out.println("Name of manufacturer="+man);
        }
        
    }
    public static void main(String args[])
    {
       CPU.ram obj1=new CPU.ram(16,"Intel");
       CPU obj2=new CPU();
       CPU.Processor obj3=obj2.new Processor(10,"Apple");
       obj1.display();
       obj3.display();
       
    }
}
