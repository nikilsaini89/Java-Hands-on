class Mobile {
    static String name; // Static variables shared by all the instances of the 
    int price;
    String brand;
    
    public void show(){
        System.out.println(name + " " + price + " " + brand); // In non static methods, we can use static methods, just an FYI
    }
    
}

public class StaticKeyword {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1234;

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 4321;

        Mobile.name = "SmartPhone"; //Static variables are accessed through class name and not object name
        obj2.show(); // prints SmartPhone 4321 Apple

    }
}
