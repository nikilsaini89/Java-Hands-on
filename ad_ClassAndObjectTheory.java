class Calculator{
    public int add(int num1, int num2){
        return num1+num2;
    }
}
class GetPen{
    public String GiveMePen(int cost){
        if(cost >= 10){
            return "Pen";
        }
        else return "No Pen";
    }
}
public class ad_ClassAndObjectTheory {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // int num1 = 5, num2 = 6;
        // System.out.println(calc.add(num1, num2));

        GetPen getPen = new GetPen();
        String result = getPen.GiveMePen(15);
        System.out.println(result);        
    }
}
