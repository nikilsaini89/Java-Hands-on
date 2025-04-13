class Demo{
    int age;
    public void show(){
        System.out.println("In show");
    }
    class Demo2{
        public void config(){
            System.out.println("in config");
        } 
    }
}
public class ab_InnerClass {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();

        /*
         * This is how we can create objecr of inner class if the inner class if not a static class, then we can do - 
         * Demo.Demo2 d2 = new Demo.Demo2();
         */
        Demo.Demo2 d2 = d.new Demo2();
        d2.config();
        
    }
}
