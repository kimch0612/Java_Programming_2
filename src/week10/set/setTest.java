package week10.set;

import java.util.HashSet;
import java.util.Set;

public class setTest {
    public static void main(String[] args) {
        Set<String> setStuff = new HashSet<>();
        setStuff.add("Book");
        setStuff.add("Monitor");
        setStuff.add("Computer");
        setStuff.add("Mouser");
        setStuff.add("USB");
        System.out.println("setStuff 요소의 개수: " + setStuff.size());
    }
}
