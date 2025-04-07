class Calculator{
    /*
     * Method overloading has alot to do with the number and types of paramters 
     * but nothing to do with the return type, if the no and type of parms is same, then 
     * a different return type would still give error.
     * 
     * All methods below follows method overloading.
     * 
     */
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, int b){
        return a+b;
    }
    public double add(int a, double b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        
    }
}
