interface shape{
    public void area();
    public void perimeter();
}
class circle implements shape{
    int r;
    public void area(){
        System.out.println("area of circle:"+3.14*(r*r));
    }
    public void perimeter(){
        System.out.println("perimeter of circle:"+2*3.14*r);
    }
}
class rectangle implements shape{
    int l,b;
    public void area(){
        System.out.println("area of rectangle:"+(l*b));
    }
    public void perimeter(){
        System.out.println("perimeter of rectangle:"+(2*(l+b)));
    }
}

public class interfacedemo{
    public static void main(String[] args){

        circle c = new circle();
        c.r = 5;
        c.area();
        c.perimeter();

        rectangle r = new rectangle();
        r.l = 4;
        r.b = 6;
        r.area();
        r.perimeter();
    }
}

