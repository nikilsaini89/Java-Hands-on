public class ac_TypeCasting {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Convert a bigger value (int) to a smaller value (byte)
        int a = 12;
        byte b = (byte)a;
        System.out.println(b); // prints 12


        int c = 127;
        byte d = (byte)c;
        System.out.println(d); // prints 127

        int e = 128;
        byte f = (byte)e;
        System.out.println(f); // prints -128 because the output is e%256 , where 256 is the complete range of byte

        int g = 257;
        byte h = (byte)g;
        System.out.println(f); // prints 1 because the output is e%256 , where 256 is the complete range of byte

        float i = 5.6f;
        int j = (int)i;
        System.out.println(j); // print 5

        byte num1 = 3;
        byte num2 = 10;
        int result = num1*num2;
        System.out.println(result); // TYPE PROMOTION
    }
}
