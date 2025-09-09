public class Main {
    public static void main(String[] args) {
        System.out.println(HashSetExp.cars);
        HashSetExp.isContains("Mazda");
        HashSetExp.eachCar();

        System.out.println("***");
        System.out.println(TreeSetExp.cars);
        TreeSetExp.getLength();
        TreeSetExp.eachNum();

        System.out.println("***");
        System.out.println(LinkedHashSetExp.cars);
        LinkedHashSetExp.eachCar();
    }
}