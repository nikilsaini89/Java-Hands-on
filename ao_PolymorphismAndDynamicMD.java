class Computer{
    public void run(){
        System.out.println("In Computer Show");
    }
}
class Laptop extends Computer{
    public void run2(){
        System.out.println("Laptop Running");
    }
}
public class ao_PolymorphismAndDynamicMD {
    public static void main(String[] args) {
        /*
         * 
         * Polymorphism - More forms
         * i) Compile Time (Early Binding) - Method Overloading
         * ii) Run Time (Late Binding) - Method Overriding
         * 
         * DMD is a run time polymorphism because it wil be decided at run time, which class's method will be called.
         * 
         */

        /*
         * This is possible that we can make the variable(object type) to be of Parent class.
         * but it will have no impact on the way it runs, 
         * The run method will be first checked in Laptop (the class of which constructor is called). 
         * If it is present, then fine else parent class and so on.
         */
        Computer obj = new Laptop();
        obj.run();

    }
}
