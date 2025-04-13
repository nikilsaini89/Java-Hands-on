class Aa{
    public void show1(){
        System.out.println("In a show");
    }
}
class B extends Aa{
    public void show2(){
        System.out.println("IN B show");
    }
}
public class aq_UpAndDownCasting {
    public static void main(String[] args) {
        Aa obj = new B();
        // obj.show2(); 
        
    }
}
