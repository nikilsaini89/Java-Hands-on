import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class as_MapFilterReducedSorted {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(5,89,32,34,7); 
        /*
         * Filter consumes a predicate and returns a stream.
         *      Stream<T> filter(Predicate<? super T> var1);
         * It is a functional interface and contains a function 
         *      boolean test(T var1);
         * which we need to implement.
         */
        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer n){
                return n%2==0;
            }
        };

        /*
         * Map consumes a Function and return a stream 
         *          <R> Stream<R> map(Function<? super T, ? extends R> var1);
         * It is a functional interface and contains a function
         *          R apply(T var1);
         * which we need to implement
         */
        Function<Integer, Integer> f = new Function<Integer, Integer>() {
            public Integer apply(Integer n){
                return n*2;
            }
        };
        /*
         * Similar thing can be done for reduce, it takes a initial value(0) and operation
         */
        int result = nums.stream()
                            .filter(p)
                            .map(f)
                            .reduce(0, (c,e) -> c+e);
        
        System.out.println(result);

        /*
         * Use of sorted
         */

        Stream<Integer> sorted = nums.stream()
                            .filter(n->n%2==0)
                            .sorted();
        sorted.forEach(n -> System.out.println(n));

        /*
         * If we want to use multiple filters, then we can use ParallelStream, it creates multiple
         * threads and we can easily(efficiently) use multiple filters,
         * do not use it with sorted etc cuz sorted want all values.
         */
    }
}
