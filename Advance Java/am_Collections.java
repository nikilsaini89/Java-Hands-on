/*
 * The Collection interface is the super interface of all major collection classes in Java (except for maps).
 */

import java.util.ArrayList;
import java.util.List;

public class am_Collections {
    public static void main(String[] args) {
        /*
         * Collection API works with objects, and takes everything as object, 
         * so the numbers entererd below(5,6,7) are not primitive int datatype, but 
         * it is of Integer type Object
         */
        // Collection nums = new ArrayList();
        // nums.add(5);
        // nums.add(6);
        // nums.add(7);
        // nums.add(8);
        // System.out.println(nums); // Collections can be printed directly, prints - [5,6,7,8]

        /*
         * But now, as we do not have defined the types, we need to use generics for the same
         * Earlier we could add anything (string etc), now we can only add integers
         */
        // Collection<Integer> nums = new ArrayList<Integer>(); 
        // for(int n: nums) System.out.println(n);
        
        /*
         * It is even more good to work with List<Integer> instead of collection, if we want to work with indexes
         */
        List<Integer> nums = new ArrayList<Integer>(); 
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        System.out.println(nums.indexOf(9)); //prints -1
        System.out.println(nums.indexOf(8)); // 3
        System.out.println(nums.get(2)); // 7


    }
}
