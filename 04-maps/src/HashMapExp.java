import java.util.HashMap;

public class HashMapExp {
    static HashMap<String, String> capitalCities = new HashMap<>();

    static {
        capitalCities.put("England", "London"); // same with add
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // duplicate overwrites
        capitalCities.put("USA", "Washington DC");
        capitalCities.remove("Norway");
    }

    public static void printCapital(String country){
        System.out.println(capitalCities.get(country));
    }

    public static void eachItem(String item){
        if (item.equals("key")){
            for (String i : capitalCities.keySet()) {
                System.out.println(i);
            }
        } else if (item.equals("value")){
            for (String i : capitalCities.values()) {
                System.out.println(i);
            }
        } else{
            for (String i : capitalCities.keySet()) {
                System.out.println("key: " + i + " value: " + capitalCities.get(i));
            }
        }
    }
}