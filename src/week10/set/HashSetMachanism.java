package week10.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class AA {
    int data;
    public AA(int data) {this.data = data;}
    public int hashCode() {
        return Objects.hash(data);
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        AA other = (AA) obj;
        return data == other.data;
    }
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
        System.out.println(aSet.size()); // 서로 다르게 인식하므로 2개라고 나옴
        /*
         * 이후 AA 클래스에서 hashcode와 equals 함수를 재정의해서 다음과 같은 결과물이 출력 됨
         * false
         * true
         * 36 :: 36
         * 1
        */
    }
}
