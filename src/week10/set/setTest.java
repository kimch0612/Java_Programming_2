package week10.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class A {
    // 중복을 확인하는 메소드 정의 필요
    // hashCode()와 equals() 둘 다 정의가 되어있어야 함
}

public class setTest {
    public static void main(String[] args) {
        Set<A> aSet = new HashSet<>();
        aSet.add(new A());
        aSet.add(new A());
        aSet.add(new A());
        System.out.println("aSet 요소의 개수: " + aSet.size());
        System.out.println(aSet);

        Set<String> setStuff = new HashSet<>();
        setStuff.add("Book");
        setStuff.add("Monitor");
        setStuff.add("Computer");
        setStuff.add("Mouse");
        setStuff.add("USB");
        setStuff.add("USB"); // 중복 허용 안 됨
        System.out.println("setStuff 요소의 개수: " + setStuff.size());
        // System.out.println(setStuff); // 입력한 순서와 출력되는 순서가 다름

        Iterator<String> iter = setStuff.iterator();
        while (true) {
            if (iter.hasNext()) {
                System.out.println("setStuff 요소: " + iter.next());
            }
            else {
                break;
            }
        }
    }
}
