import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda{
    static ArrayList<Integer> numbers = new ArrayList<Integer>();

    static {
        numbers.add(5);
        numbers.add(9);
        numbers.add(1);
        numbers.add(3);
        numbers.forEach((n) -> {System.out.println(n);});
    }

    static Consumer<Integer> method = (n) -> {System.out.println(n);}; // generic built in interface

//    Function exclaim = new Function() {
//        @Override
//        public String run(String s) {
//            return s + "!";
//        }
//    };
    // long version


    public static void printFormatted(String str, LambdaFunc format) {
        String result = format.run(str);
        System.out.println(result);
    }




}
