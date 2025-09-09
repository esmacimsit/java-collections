import java.util.LinkedHashSet;

public class LinkedHashSetExp {
    static LinkedHashSet<String> cars = new LinkedHashSet<>();

    static {
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove("BMW");
    }

    public static void eachCar(){
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
