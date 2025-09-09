import java.util.LinkedList;
import java.util.Collections;

public class LinkedListExp {
    // almost identical to arraylist because of the list interface
    static LinkedList<String> langs = new LinkedList<String>();
    // some linked list methods
    static{
        langs.addFirst("swift");
        langs.add("java");
        langs.add("c#");
        langs.add("flutter");
        langs.addLast("python");
        langs.removeFirst();
        langs.removeLast();
        langs.getFirst();
        langs.getLast();
    }

    public static void reverseLangs(){
        Collections.sort(langs, Collections.reverseOrder());
    }
}
