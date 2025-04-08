public class Strings {
    /*
     * Primitive Data Types start withs small letters like int float boolean 
     * but String is not a P DataType, it is a class but
     * String temp = "Heyy"
     * we do not create a object of it using the new keyword, why?
     * because an object is automatically createde behind the scenes
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String name = "Nikil";

        System.out.println(name.concat(" Saini")); // print Nikil Saini
        System.out.println(name.charAt(2)); // print k
        System.out.println(name.hashCode()); //print unique hascode everytime (75268883 here)


        /*
         * A little more on Strings
         */
        /*
         * As String is a class, sp every object of it (like name, name1) will be stored in Heap and the corresponding address 
         * will be stored in stack (Refer Stack and Heap first).
         * Inside the Heap, there is a section called as constant string pool, which contains the strings and a value can not 
         * be changed.
         * 
         * So, when name = Rohit, and when name is update to Rohit Sharma, a new string is created and the corresponding
         * address is update in the stack, the previous string Rohit is now available for Garbage Collection
         */
        String name3 = "Rohit";
        name3 = name3 + "Sharma";
        System.out.println(name);
        /*
         * Here name1 and name2 are strings that corresponds to same memory location in heap(contant pool)
         * They will print true on (name1==name2)
         */
        String name1 = "rohit";
        String name2 = "rohit";

        /*
         * Which means that Strings are mutable in java, but There are 2 ways to make immutable Strings - 
         * 1.) String Buffer
         * 2.) String Builder 
         * There is only one difference that string buffer is thread safe and string builder is not, will discussin upcoming sessions
         */

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // prints 16, the buffer capacity of SB in bytes

        StringBuffer sb2 = new StringBuffer("Nikil");
        System.out.println(sb2.capacity()); // prints 21, the capacity of SB

        // The reason for buffer is that, as it is changeable, we will change the data, and everytime we change the data,
        // It may consume a continous memory location in heap memory, but if there is no sapce available, it has to relocate, 
        // to reduce the relocation of string, this buffer is provided

        System.out.println(sb2.append(" Saini")); // Nikil Saini
        System.out.println(sb2.length()); // 11

        String newStr = sb2.toString();
        System.out.println(newStr); // Nikil Saini

        sb2.deleteCharAt(5); //delete the white space
        /*
         * Similarly we can insert, set the data. het substring and alot
         */


    }
}
