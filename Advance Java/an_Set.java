import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class an_Set {
    public static void main(String[] args) {
        Collection<Integer> nums = new HashSet<>();
        // Set<Integer> st = new HashSet<>(); same as above, Set interface extends Collection Interface
        /*
         * Hashset does not follow any sequence while we print it
         * If we want our output to be of sorted order, then we can use TreeSet(it prints in sorted order)
         */
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);


        /*
         * We can use this iterator because collection extends Iterable ->
         *     Iterator<T> iterator();
         * which helps us to iterate
         */
        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.print(values.next() + " ");
    }
}
