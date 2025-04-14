import java.util.concurrent.atomic.AtomicInteger;

// class Counter{
//     /*
//      * It performs atomic operations, meaning:
//      * The read-modify-write cycle (like count++) is done as one uninterruptible unit.
//      * No other thread can “sneak in” between those steps.
//      */
//     public int count;
//     public synchronized void Increment(){
//         count++;
//     }
// }

class Counter {
    /*
     * Same Reason as Above
     */
    public AtomicInteger count = new AtomicInteger();

    public void Increment() {
        count.incrementAndGet();
    }
}



public class al_RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () ->{
            for(int i=0; i<10000; i++){
                c.Increment();
            }
        };  
    
        Runnable obj2 = () -> {
            for(int i=0; i<10000; i++){
                c.Increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        // We are waiting for Threads to complete before printing count, else it will print 0 mostly
        t1.join(); 
        t2.join();

        System.out.println(c.count);

    }
}
