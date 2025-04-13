class Demo{
    public void show(){
        System.out.println("In Demo Show");
    }
}

public class ac_AnonymousInnerClass {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Demo d = new Demo(){
            public void show1(){
                System.out.println("In new Show");
            }
        };
        /*
         * It will first search for show method in the new implementation, if found, it gets it from there else 
         * it will go in the Demo class and take the implementation from there.
         * 
         * It works similar if the Demo class is abstract. Point to note here is that the object is created of the
         * Inner class always and the Inner class sort of extends the above class. 
         */
        d.show();
    }
}
