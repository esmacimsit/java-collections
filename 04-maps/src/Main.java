public class Main {
    public static void main(String[] args) {
        System.out.println(HashMapExp.capitalCities);
        HashMapExp.printCapital("England");
        System.out.println(HashMapExp.capitalCities.size());
        HashMapExp.eachItem("key");
        HashMapExp.eachItem("value");
        HashMapExp.eachItem("x");

        System.out.println(TreeMapExp.capitalCities);
        TreeMapExp.eachItem();

        System.out.println(LinkedHashMapExp.capitalCities);
        LinkedHashMapExp.eachItem();
    }
}