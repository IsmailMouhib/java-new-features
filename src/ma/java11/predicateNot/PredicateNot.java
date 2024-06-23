package ma.java11.predicateNot;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNot {

    public static boolean isEven (Integer number) {
        return number%2 == 0;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 33, 45, 50, 21, 3, 11, 6);
        Predicate<Integer> evenNumber = number -> number%2 == 0;
        numbers.stream().filter(evenNumber).forEach(System.out::println);
        System.out.println("---------");
        numbers.stream().filter(evenNumber.negate()).forEach(System.out::println);

        System.out.println("---------");
        numbers.stream().filter(Predicate.not(number -> isEven(number))).forEach(System.out::println);
    }
}
