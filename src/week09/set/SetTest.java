package week09.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        // Set<E> 컬렉션 정의
        Set<Integer> score = new HashSet();
        score.add(11);
        score.add(22);
        score.add(11); // 중복 허용 안 함
        System.out.println(score);
    }
}
