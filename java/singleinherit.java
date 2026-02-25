public class singleinherit {
    public static void main(String[] args) {
        dog d=new dog();
        d.bark();
        d.eat();
    }
    
}
class animal{
    void eat(){
        System.out.println("animal is eating.");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("dog is barking");
    }
}
