class Mobile {
    static String name; // Static variables shared by all the instances of the Object
    int price;
    String brand;


    /*
     * Static Block - Used to initialise the static variables
     */

    static
    {
        System.out.println("In static Block");
        /*
         * Will be called only once when the class is loaded (There is a coommon area in the JVM
         * that contains all the classes which are loaded once before making their instance).
         * When the class in loaded, this static block is called(see print below) and this is the reason that it is called
         * before the constructors because cons will be called while making the object.
         */
        name = "Nikil";
    }

    public Mobile(){
        System.out.println("In Constructor");
        brand = "";
        price = 1200;
    }

    public void show(){
        // In non static methods, we can use static variables
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

public class ai_StaticKeyword {
    /*
     * The main is static because it is the starting point of execution, if we do not make static, that means we need to make 
     * object of class - StaticKeyword, but as execution is not started, we can not make the object, so there is a deadlock, 
     * hence make static
     */
    @SuppressWarnings("unused")
     public static void main(String[] args) throws ClassNotFoundException {
        /* 
         * Prints - 
         * In static Block
         * In Constructor
         * In Constructor
         * SmartPhone 4321 Apple
         * In the static Method
         * SmartPhone 4321 Apple
         * In Constructor
         */
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1234;

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 4321;

        Mobile.name = "SmartPhone"; //Static variables are accessed through class name and not object name
        obj2.show(); // prints SmartPhone 4321 Apple

        Mobile.show1(obj2);  // prints SmartPhone 4321 Apple


        /**
         * Static Block
         */
        Mobile obj3 = new Mobile();

        /*
         * How to only load a class but not make a object of it, this will not create a object
         * but loads the class, so the static block will be called and forName may throw a exception
         * Class Not Found
         */
        Class.forName("Mobile");

    }
}
