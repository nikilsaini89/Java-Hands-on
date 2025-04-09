class Human{
    private String name; //Encapsulation because methods + variables
    private int age;

    /*
     * Getters and Setters
     */

    public String getName() {
        return name;
    }
    public void setName(String name) {
        /*
         * Now as the local Variable name(method description) and the instance varible
         * name (which is made private above) are same, so there will be a confusion as to which 
         * variable is which, maybe the instance keep assigning value to itself, this problem can be solved
         * if we pass the object too and assign value using that, but boom, no need to do that
         * this keyword does the same, it acts as the object which called the function and assign value to it.
         */
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class aj_Encapsulation {
    public static void main(String[] args) {
        
    }
}
