public class aq_WrapperClass {
    public static void main(String[] args) {
        int num = 12; // primitive 
        Integer num1 = num; // Auto boxing as primitive got converted into object automatically
        System.out.println(num1);

        //Auto unboxing as object got converted to primitive automatically
        //this can also be done through .intValue() method as well
        int numAgain = num1; 
        System.out.println(numAgain);

        String str = "12";
        int num2 = Integer.parseInt(str);
        System.out.println(num2);
    }
}
