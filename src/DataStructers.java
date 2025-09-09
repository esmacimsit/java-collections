import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class DataStructers {
    // array list: ordered collection, dynamic
    static ArrayList<String> cars = new ArrayList<String>();

    static {
        cars.add("volvo");
        cars.add("bmw");
        cars.add("ford");
        cars.add("mazda");
    }

    public static void printCars(){
        Iterator<String> it = cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    } // loop through elements, similar logic to pointer

    // hashset: every item unique and no duplicates allowed
    static HashSet<String> animals = new HashSet<String>();

    static {
        animals.add("dog");
        animals.add("cat");
        animals.add("cow");
        animals.add("dog"); // duplicate ignored
        animals.add("sheep");
    }

    // hashmap: stores key value pair like dictionary on python
    static HashMap<String, String> capitals = new HashMap<String, String>();

    static {
        capitals.put("england", "london");
        capitals.put("german", "berlin");
        capitals.put("usa", "washington dc");
    }
}