/* 
 * If all the methods inside the abstract class are abstract methods then we can use a interface
 * as a substitue. All mehtods inside the Interface are public abstract by default and a class will implement these methods
 * and using that class we can instantiate it, A interface can not be instantiated (but we can make reference of it). 
 * 
 * A Interface do not have any memory in the heap, so all the variables have to be static and final. Therefore no variable can be overwritted,
 * Also can be accessed directy from the reference of the interface.
 * 
 * Multiple Interfaces can be implemented by a class like - class Demo implements Car, Bus etc but a class can only extends one abstract class
 * An interface can also extends another interface just like classes do.
 * 
 */


interface Car{
    int a = 4; // final and static
    void run();
    void music();
}
interface BdhiaCar{
    void bdhiaMusic();
}
class Demo implements Car, BdhiaCar{
    public void run(){
        System.out.println("In run");
    }
    public void music(){
        System.out.println("In Music");
    }
    public void bdhiaMusic(){
        System.out.println("In bdhia music");
    }
}
public class ad_Interface {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.a); // Prints 4
        System.out.println(Car.a);  // Prints 4

        Car c = new Demo(); // from this we can only call methods of Car(music, run and not bdhiaMusic)
        c.music(); //runs
        // c.bdhiaMusic(); error

    }
}
