class A{
    public void show1(){
        System.out.println("In a show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("IN B show");
    }
}
public class aq_UpAndDownCasting {
    public static void main(String[] args) {
        A obj = new B();
        // obj.show2(); 

    }
}
