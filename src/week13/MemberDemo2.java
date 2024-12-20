package week13;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MemberDemo2 {
    public static void main(String[] args) {
        Stream<String> ss;
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);

        Stream<Integer> si = ages.stream();
        System.out.println(si.reduce(0, (a, b) -> a + b));
        si = ages.stream();
        System.out.println(si.max(Integer::compareTo).get());
        IntStream is = ages.stream().mapToInt(a -> a.intValue());
        System.out.println(is.average().getAsDouble());
    }
}

enum Gender {
    남, 여
}
