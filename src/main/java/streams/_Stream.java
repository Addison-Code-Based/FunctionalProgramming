//https://www.youtube.com/watch?v=rPSL1alFIjI&list=PLgXIuzFw8z5KIuT3LIEuZv2tybY7Ndzla&index=13

package streams;

import java.util.List;

import static streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Benny", NON_BINARY)
        );

        //Function<Person, String> personStringFunction = person -> person.name;
        //ToIntFunction<String> length = String::length;
        //IntConsumer println = System.out::println;
        //people.stream()
                //.map(person -> person.name)
                //.map(personStringFunction) //If extracted to variable above

                //Lambda
                //.mapToInt(name -> name.length())

                //Method Reference
                //.mapToInt(String::length)
                //.mapToInt(length) //If extracted to variable above

                //Remove Duplicates
                //.collect(Collectors.toSet())


                //Lambda
                //.forEach(gender -> System.out.println(gender));
                //.forEach(name -> System.out.println(name));

                //Method Reference
                //.forEach(System.out::println);
                //.forEach(println); //If extracted to variable above

        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));

        System.out.println(containsOnlyFemales);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE, NON_BINARY
    }
}
