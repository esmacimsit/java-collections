import java.util.HashSet;

public class HashSetExp {
    static HashSet<String> cars = new HashSet<String>();

    static {
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // duplicate (appears once)
        cars.add("Mazda");
        cars.remove("BMW");
//        cars.clear();
    }

    public static void isContains(String car){
        if (cars.contains(car)){
            System.out.println("we have it");
        } else{
            System.out.println("we dont have it");
        }
    }

    public static void eachCar(){
        for (String car : cars) {
            System.out.println(car);
        }
    }
}