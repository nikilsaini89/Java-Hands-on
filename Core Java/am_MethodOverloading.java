class Calc{
    protected int add(int n, int m){
        return n+m;
    }
}
class AdvCalc extends Calc{
    /*
     * In Method Overriding, We have the method with same name and with same param list and return type
     * Access Modifier can be different, we can make it public->private, but not vice versa
     * Can't override a static method (that’s method hiding)
     * Can't override a final method
     * Can't override a private method (it’s not visible to subclasses)
     */
     public int add(int n, int m){
        return n+m+10;
    }

}
public class am_MethodOverloading {
    public static void main(String[] args) {
        AdvCalc cal = new AdvCalc();
        int ans = cal.add(5,5);
        System.out.println(ans);
    }
}
