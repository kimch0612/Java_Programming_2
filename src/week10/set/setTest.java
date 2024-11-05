package week10.set;

import java.util.HashSet;
import java.util.Set;

public class setTest {
    public static void main(String[] args) {
        Set<String> setStuff = new HashSet<>();
        setStuff.add("Book");
        setStuff.add("Monitor");
        setStuff.add("Computer");
        setStuff.add("Mouse");
        setStuff.add("USB");
        setStuff.add("USB"); // 중복 허용 안 됨
        System.out.println("setStuff 요소의 개수: " + setStuff.size());
        System.out.println(setStuff); // 입력한 순서와 출력되는 순서가 다름
    }
}
