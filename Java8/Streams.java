package Java8;

import java.util.Optional;

public class Streams {
    public static void main(String[] args) {
        // first repeating character using streams
        String s = "abcab";
        char c1 = s.chars().mapToObj(c->(char)(c)).filter(c->s.indexOf(c)!=s.lastIndexOf(c)).findFirst().orElse(null);

    }
}
