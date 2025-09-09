import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExp {
    static ArrayList<String> brands = new ArrayList<String>();
    //    static var =  new ArrayList<String>(); // alternative usage
// if you declare with list = new... more flexible
    static {
        brands.add("apple");
        brands.add("microsoft");
        brands.add("ibm");
        brands.add(0, "oracle"); // add to index 0
        brands.set(2, "google");
        brands.remove(2);
//        brands.clear(); // empty list
    }

    public static void sortBrands() {
        Collections.sort(brands);
    }

    public static void printBrands(){
        for (int i = 0; i < brands.size(); i++) {
            System.out.println(brands.get(i));
        }
        System.out.println("printed with for loop");
    }

    // same thing with for each loop
    public static void printEachBrand(){
        for (String i : brands) {
            System.out.println(i);
        }
        System.out.println("printed with for each loop");
    }
}