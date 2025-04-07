public class DataTypes{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        long num3 = 23323224533l; // 8 bytes --> 64 bits, range  range -2^63 to 2^63-1
        int num = 23443; // 4 bytes --> 32 bits, range -2^31 to 2^31-1
        short num2 = 2345; // 2 bytes --> 16 bits, range -2^15 to 2^15-1
        byte num4 = 127; // 1byte --> 8 bits, -128 to + 127

        float flVal = 5.5f; // 4 bytes, have limited pricision
        double val = 5.5; // 8 bytes

        char ch = 'K'; // 2 bytes because Java follows UNICODE and NOT ASCII. In single Quotes, takes only one character.
        boolean isTrue = true; // 1 byte
    }
}