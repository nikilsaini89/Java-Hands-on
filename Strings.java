public class Strings {
    /*
     * Primitive Data Types start withs small letters like int float boolean 
     * but String is not a P DataType, it is a class but
     * String temp = "Heyy"
     * we do not create a object of it using the new keyword, why?
     * because an object is automatically createde behind the scenes
     */
    public static void main(String[] args) {
        String name = "Nikil";

        System.out.println(name.concat(" Saini")); // print Nikil Saini
        System.out.println(name.charAt(2)); // print k
        System.out.println(name.hashCode()); //print unique hascode everytime (75268883 here)
    }
}
