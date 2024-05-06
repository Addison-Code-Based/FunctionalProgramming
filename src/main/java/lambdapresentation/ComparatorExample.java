package lambdapresentation;

import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<String> strings = (s1, s2) -> s2.compareTo(s1);
        Comparator<String> moreStrings = (s1, s2) -> - s1.compareTo(s2);
    }
}