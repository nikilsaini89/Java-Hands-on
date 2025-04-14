import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Comparable Versus Comparator
 * 
 * Comparator -> It is making a external comparator, which tells that Collections class's sort function
 * that what logic to follow to sort the List(or whatever)
 * 
 * Comparable is telling that class only (by extending the Comparable interface) which contains
 * the compareTo function
 */
class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int compareTo(Student that){
        return this.age <= that.age ? 1 : -1;
    }
} 
public class ap_Comparator {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        Comparator<Integer> cmp = (i, j) -> i<=j ? 1 : -1; // Lambda expression as Comparator is FunctionalInterface

        nums.add(5);
        nums.add(1);
        nums.add(3);
        nums.add(9);
        Collections.sort(nums, cmp);
        System.out.println(nums);

        List<Student> stud = new ArrayList<>();

        stud.add(new Student("Nikil;", 21));
        stud.add(new Student("Ni Btauga;", 18));

        for(Student s: stud){
            System.out.println(s.age);
        }

    }   
}
