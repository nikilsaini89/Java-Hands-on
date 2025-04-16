import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ar_StreamApi {
    public static void main(String[] args) {
        /*
         * Stream is a interface.
         * The .stream() methods returns the object of stream
         * Whatever we do in stream will not effect our original list values
         * Stream can only be used once, we need to make new stream everytime.
         */
        List<Integer> nums = Arrays.asList(5,89,32,34,7); 
        Stream<Integer> s1 = nums.stream(); // Now all the values are in stream

        // s1.forEach(n -> System.out.println(n)); // prints the values;

        Stream<Integer> s2 = s1.filter(n -> n%2 ==0); //makes new stream of even values
        Stream<Integer> s3 = s2.map(n -> n*2); // make new stream by mul the even values
        int result = s3.reduce(0, (c,e)->c+e); // make new stream by adding all the values
        System.out.println(result); // pritns the result

        /*
         * We can write everything in one line
         */
        int result2 = nums.stream()
                            .filter(n->n%2==0)
                            .map(n->n*2)
                            .reduce(0, (c,e) -> c+e);
        
        System.out.println(result2);


    }
}
