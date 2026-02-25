
class shape {
    void area(int a,int b){
        int result=a+b;
        System.out.println("area of rectangle="+result);
    }
    void area(float r){
        float result=3.15f*r*r;
        System.out.println("area of circle:"+result);
    }
}
public class test{
    public static void main(String[] args) {
        shape a=new shape();
        a.area(5,3);
        a.area(2.10f);
    }
}
