import java.util.ArrayList;

public class Main {
    @SuppressWarnings("unchecked") // to avoid warnings
    public static void main(String[] args) {
        //    ArrayList<int> myNums = new ArrayList<int>(); // argument cannot be primitive
        ArrayList<Integer> myNums = new ArrayList<Integer>(); // valid

        System.out.println(Wrapper.myInt);
        System.out.println(Wrapper.myDouble);
        System.out.println(Wrapper.myChar);
        System.out.println(Wrapper.myString);
        System.out.println(Wrapper.myString.length()); // 1

        Generic<String> stringGeneric = new Generic<>();
        stringGeneric.set("hi");
        System.out.println("item = " + stringGeneric.get());

        Generic<Integer> integerGeneric = new Generic<>();
        integerGeneric.set(50);
        System.out.println("item = " + integerGeneric.get());

        printArray(Variables.names);
        printArray(Variables.numbers);

        ExtendedGeneric<Integer> intExt = new ExtendedGeneric<>(Variables.intNums);
        System.out.println("extInt.average() = " + intExt.average());

        ExtendedGeneric<Double> doubleExt = new ExtendedGeneric<>(Variables.doubleNums);
        System.out.println("extInt.average() = " + doubleExt.average());

        Annotations yell = new AnnotationsChild();
        yell.makeSound();

        Annotations.oldMethod(); // deprecated

        ArrayList cars = new ArrayList();
        cars.add("mazda");
        System.out.println(cars);

        System.out.println(Lambda.numbers);
        System.out.println(Lambda.method);

        LambdaFunc exclaim = (s) -> s + "!";
        LambdaFunc ask = (s) -> s + "?";
        Lambda.printFormatted("Hello", exclaim);
        Lambda.printFormatted("Hello", ask);

        AnonymousClass a = new AnonymousClass() {
            @Override
            public void sayHello() {
                System.out.println("hello from anonymouse class");
            }
        };
        a.sayHello();

    }
    // generic method
    public static <T> void printArray(T[] array){
        for (T t : array) {
            System.out.println(t);
        }
    }
}