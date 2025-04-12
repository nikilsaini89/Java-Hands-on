public class ab_Literals {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        int binary = 0b101; 
        System.out.println(binary); //print 5

        int hexadecimal = 0x7E; 
        System.out.println(hexadecimal); //print 126

        int zeroWithUnderscores = 100_00_00;
        System.out.println(zeroWithUnderscores); //print 1000000

        double db = 56;
        System.out.println(db); // print 56.0

        char c = 'a';
        c++;
        System.out.println(c); // print b
        
    }
}
