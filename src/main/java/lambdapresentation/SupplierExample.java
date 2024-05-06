package lambdapresentation;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> number = () -> 42;
        //Supplier<Integer> random = () -> new Random().nextInt();
        System.out.println(returnNumber(number));
    }
    private static int returnNumber(Supplier<Integer> supplier) {
        return supplier.get();
    }

}
