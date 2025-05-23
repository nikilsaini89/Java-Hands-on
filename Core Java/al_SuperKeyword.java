
class Parent{
    public Parent(){
        super(); // because every class in Java extends Object class, so this is called implicitly.
        System.out.println("Parent Constructor Called");
    }
    public Parent(int a){
        super(); 
        System.out.println("Parent Constructor with int called");
    }
    public void show(){
        System.out.println("Inside Parent Show");
    }
    public void show(int a){
        System.out.println("Inside Parent Show with int " + a);
    }
}
class Child extends Parent{
    // This class only extends Parent class and not Object class, so there is no multiple inheritance even now
    public Child(){
        super.show(); // Calls the Parent show method
        // super.show(5); // Calls the Parent show method with int
        System.out.println("Child Constructor Called");
    }
    public Child(int a){
        this(); 
        // super(a); // Calls the Parent constructor with int
        // super(); // This will call the Parent constructor without int
        System.out.println("Child Constructor with int called");
    }
}
public class al_SuperKeyword {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        /**
         * Super Keyword
         * 1. Super Keyword is used to refer the immediate parent class object.
         * 2. It is used to access the data members, constructor, methods of parent class.
         * 3. We can not use super keyword to access the static and Private members of parent class.
         * 4. No Matter if I am calling the method of parent class, the parent class constructor will be called first
         */
        /**
         * This keyword is used to refer the current class object.
         */

        // Child c = new Child(); 
        System.out.println();
        Child c1 = new Child(5);  
    }
}