import java.util.HashMap;
import java.util.Map;

public class ao_Map {
    public static void main(String[] args) {
        /*
         * HashTable also works in similar way, Hashtable is thread safe(Synchronised), but with HashMap
         * we need to use Synchronised externally
         */
        Map<String, Integer> students = new HashMap<>();
        students.put("Nikil", 68);
        students.put("Dev", 59);
        students.put("Harsh", 63);
        students.put("Akhil", 48);

        System.out.println(students.keySet()); // prints [Dev, Akhil, Harsh, Nikil]
        for(String name: students.keySet()){
            System.out.println(name + " : " + students.get(name));
        }
    }
}
