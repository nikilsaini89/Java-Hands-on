class A{
    public A(){
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("Inside show");
    }
}

public class ak_AnaonymousObject {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        /* Prints -
         * Object Created
         * Object Created
         * Inside show
         */
        A a; // This is the reference Variable Creation in the Stack
        a = new A(); // This is the object creation in the Heap Memory and assigning its address in the stackSS

        // We can also create new object and not assign them in stack, this is known as anonymous Object and they can be 
        // used only once. This creates a new object everytime as we can not reuse.
        new A().show();
    }
}
