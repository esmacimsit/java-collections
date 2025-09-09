import java.util.TreeSet;

public class TreeSetExp {
    static TreeSet<String> cars = new TreeSet<String>();

    static {
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove("Volvo");
    }

    public static void getLength(){
        System.out.println(cars.size());
    }

    static TreeSet<Integer> numbers = new TreeSet<>();

    static {
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
    }

    public static void eachNum(){
        for (int i : numbers) {
            System.out.println(i);
        }
    }


}
