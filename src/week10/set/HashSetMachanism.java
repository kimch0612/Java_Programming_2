package week10.set;

import java.util.HashSet;
import java.util.Set;

class AA {
    int data;
    public AA(int data) {this.data = data;}

}

public class HashSetMachanism {
    public static void main(String[] args) {
        Set<A> aSet = new HashSet<>();
        AA a1 = new AA(5);
        AA a2 = new AA(5);
        System.out.println(a1==a2); // 주소값을 비교하게 되므로 당연히 다르다고 나옴
        System.out.println(a1.equals(a2)); // 
    }
}
