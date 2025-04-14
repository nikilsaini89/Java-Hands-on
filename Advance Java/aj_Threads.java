class t1 extends Thread{
    public void run(){
        for(int i=0; i<1000; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}
class t2 extends Thread{
    public void run(){
        for(int i=0; i<1000; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}    
public class aj_Threads {
    public static void main(String[] args) {
        t1 obj1 = new t1();
        t2 obj2 = new t2();

        /*
         * sout(obj1.getPriority()) prints the priority of obj1 (1-10)
         * obj1.setpriority(1-10) or Thread.MAX_PRIORITY etc
         */
        obj1.start();
        obj2.start();

        /*
         * Instead of extending the thread class, we can also directly implements the runnable interface
         * For that, we need to make two threads using 
         * Runnable obj1 = new A();
         * Thread t1 = new Thread(obj1);
         * t1.start();
         * 
         * similar for Thread 2
         * 
         */
    }
}
