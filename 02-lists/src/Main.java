public class Main {
    public static void main(String[] args) {
        System.out.println(ArrayListExp.brands);

        ArrayListExp.sortBrands();
        ArrayListExp.printBrands();
        ArrayListExp.printEachBrand();

        System.out.println(LinkedListExp.langs);

        LinkedListExp.reverseLangs();
        System.out.println(LinkedListExp.langs);
    }
}