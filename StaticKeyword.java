class Mobile {
    static String name; // Static variables shared by all the instances of the 
    int price;
    String brand;
    
    public void show(){
        // In non static methods, we can use static variables, just an FYI
        System.out.println(name + " " + price + " " + brand); 
    }

    public static void show1(Mobile obj){
        // In static methods, we CAN NOT DIRECTLY  use non-static variables, becuase there will be a confusion as to
        // which object's varibles to refer to.
        System.out.println("In the static Method");
        /*
         * Lets see how to do it indirectly - by passing the obj in the function
         * 
         */
        System.out.println(name + " " + obj.price + " " + obj.brand); 
    }
    
}

public class StaticKeyword {
    /*
     * The main is static because it is the starting point of execution, if we do not make static, that means we need to make 
     * object of class - StaticKeyword, but as execution is not started, we can not make the object, so there is a deadlock, 
     * hence make static
     */
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1234;

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 4321;

        Mobile.name = "SmartPhone"; //Static variables are accessed through class name and not object name
        obj2.show(); // prints SmartPhone 4321 Apple

        Mobile.show1(obj2);  // prints SmartPhone 4321 Apple

    }
}
