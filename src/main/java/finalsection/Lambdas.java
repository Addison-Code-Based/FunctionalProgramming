package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        Function<String, String> upperCaseName = name -> {
            if (name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        BiFunction<String, Integer, String> upperCaseNameBi = (name, age) -> {
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        //String upperCasedName = upperCaseNameBi.apply("Alex", 20);
        //System.out.println(upperCasedName);
        System.out.println(upperCaseNameBi.apply("Alex", 20));
    }
}
