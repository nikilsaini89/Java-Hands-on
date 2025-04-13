/*
 * Types of Interfaces in Java - 
 * 
 * i) Normal Interface - More than 2 methods
 * ii) Functional/SAM  - Single Abstract Methods (We can only use lambda expression using functionalInterface)
 * iii) Marker Interface - It has no method, it is very useful in serialisation and deserialisation in java.
 * 
 */
@FunctionalInterface
interface car {
    void run(int i);
}

@FunctionalInterface
interface calculator{
    int add(int a, int b);
}
public class af_TypesOfInterfaceAndLambdaExpression {
    public static void main(String[] args) {

        //Simple version
        car car = new car(){
            // Inner class
            public void run(int i){
                System.out.println("in Run " + i);
            }
        };
        car.run(5); // prints in run 5

        /**
         * Enhanced version using lambda expression
         * removed () because there is only one var
         * removed {} cuz of single statement   
         */ 

        car  car2 = i -> System.out.println("in Run " + i);
        
        car2.run(5); // prints in run 5

        calculator calc = (i,j)-> i+j; // remove the return statement in lambda expression
        System.out.println(calc.add(5,6)); // prints 11
    }
}