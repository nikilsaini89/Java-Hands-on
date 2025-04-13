abstract class car{
    abstract void drive();
    
    public void playMusic(){
        System.out.println("Play Music");
    }
}
class BMW extends car{
    public void drive(){
        System.out.println("Drive");
    }
}

public class aa_AbstractKeyword {
    public static void main(String[] args) {
        /*
         * We use abstract keyword, when we do not want to define the method, just want to declare it
         * A abstract method have to be in a abstract class only
         * A abstract class can have any type of method (abstract only, non-abstract only, both)
         * We can not make the object of a abstract class.
         * The class that extrends an abstract class have to define all the abstract methods,
         * or we can make the child class too as abstract.
         */
        car bmw = new BMW();
        bmw.drive();
        bmw.playMusic();
        /*
         * print - 
         * Drive
         * play Music
         */
    }   
}
