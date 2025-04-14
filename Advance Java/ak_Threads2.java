public class ak_Threads2 {

    Runnable obj1 = () ->{
        for(int i=0; i<1000; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    };

    Runnable obj2 = () -> {
        for(int i=0; i<1000; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    };
    public ak_Threads2() {
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        new ak_Threads2(); // Starts the threads
    }
}
