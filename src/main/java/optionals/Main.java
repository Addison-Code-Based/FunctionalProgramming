//https://www.youtube.com/watch?v=rPSL1alFIjI&list=PLgXIuzFw8z5KIuT3LIEuZv2tybY7Ndzla&index=13

package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Optional.ofNullable("john@gmail.com")
                //.orElseGet(() -> "default value");
                //.orElseThrow(() -> new IllegalArgumentException("exception"));
                //.ifPresent(value -> System.out.println(value));
                //.ifPresent(System.out::println);
                //.ifPresent(email -> System.out.println("Sending email to " + email));
        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> {
                            System.out.println("Cannot send emaill");
                        });
    }
}
