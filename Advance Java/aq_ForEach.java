import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class aq_ForEach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,4,9,1,3);

        /*
         * For Each is a method that accepts a consumer and Consumer is a functionalInterface
         * which contains an abstract method accept which we need to implement.
         */
        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n){
                System.out.println(n);
            }
        };
        nums.forEach(con);

        /*
         * In Short
         */
        nums.forEach(n -> System.out.println(n));
    }
}
