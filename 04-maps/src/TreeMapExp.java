import java.util.TreeMap;

public class TreeMapExp {
    static TreeMap<String, String> capitalCities = new TreeMap<>();

    static {
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
    }

    public static void eachItem(){
        for (Object i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}
