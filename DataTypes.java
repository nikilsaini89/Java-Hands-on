public class DataTypes{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        long num3 = 2345; // 8 bytes --> 64 bits, range  range -2^63 to 2^63-1
        int num = 23443; // 4 bytes --> 32 bits, range -2^31 to 2^31-1
        short num2 = 2345; // 2 bytes --> 16 bits, range -2^15 to 2^15-1
        byte num4 = 127; // 1byte --> 8 bits, -128 to + 127

        float flVal = 5.5f; 
        double val = 5.5;

        char ch = 'K'; // In single Quotes, takes only one character. Also Java follows UNICODE and NOT ASCII, 
        boolean isTrue = true;
    }
}