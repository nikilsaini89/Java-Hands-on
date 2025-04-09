
class Parent{
    public Parent(){
        super(); // because every class in Java extends Object class, so this is called implicitly.
        System.out.println("Parent Constructor Called");
    }
    public Parent(int a){
        super(); 
        System.out.println("Parent Constructor with int called");
    }
}
class Child extends Parent{
    // This class only extends Parent class and not Object class, so there is no multiple inheritance even now
    public Child(){
        super();
        System.out.println("Child Constructor Called");
    }
    public Child(int a){
        super(a); // Calls the Parent constructor with int
        // super(); // This will call the Parent constructor without int
        System.out.println("Child Constructor with int called");
    }
}
public class al_SuperKeyword {
    public static void main(String[] args) {
        /**
         * Super Keyword
         * 1. Super Keyword is used to refer the immediate parent class object.
         * 2. It is used to access the data members of parent class.
         * 3. It is used to call the constructor of parent class.
         * 4. It is used to call the method of parent class.
         * 5. We can not use super keyword to access the static and Private members of parent class.
         */
        /**
         * 
         */

        Child c = new Child(); // Calls the Parent constructor first and then Child constructor
        System.out.println();
        Child c1 = new Child(5); // Calls the Parent constructor with int and then Child constructor with int     
    }
}