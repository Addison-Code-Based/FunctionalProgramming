//https://www.youtube.com/watch?v=rPSL1alFIjI&list=PLgXIuzFw8z5KIuT3LIEuZv2tybY7Ndzla&index=13

package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+011111111",
                LocalDate.of(2010,1,1)
        );

        //System.out.println(new CustomerValidatorService().isValid(customer));
        //CustomerValidatorService validatorService = new CustomerValidatorService();
        //validatorService.isValid(customer);

        //Using Combinator Pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
