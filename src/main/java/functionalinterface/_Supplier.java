package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        //Imperative
        System.out.println(getDBConnectionUrl());

        //Functional
        System.out.println(getDBConnectionSupplier.get());
        System.out.println(getDBConnectionSupplierList.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionSupplier = () -> "jdbc://localhost:5432/users";
    static Supplier<List<String>> getDBConnectionSupplierList = () -> List.of(
            "jdbc://localhost:5432/users",
            "jdbc://localhost:5432/customers");

}
