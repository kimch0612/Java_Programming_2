package week10.set;

import java.util.HashSet;
import java.util.Set;

class AA {
    int data;
    public AA(int data) {this.data = data;}

}

public class HashSetMachanism {
    public static void main(String[] args) {
        Set<AA> aSet = new HashSet<>();
        AA a1 = new AA(5);
        AA a2 = new AA(5);
        System.out.println(a1==a2); // 주소값을 비교하게 되므로 당연히 다르다고 나옴
        System.out.println(a1.equals(a2)); // 최상위 클래스인 Object 클래스의 equals()를 호출해서 사용하는건데, 사실상 '=='와 동일하게 작동함.
        System.out.println(a1.hashCode() + " :: " + a2.hashCode()); // 서로 값이 다름
        aSet.add(a1); aSet.add(a2);
        System.out.println(aSet.size());
    }
}
