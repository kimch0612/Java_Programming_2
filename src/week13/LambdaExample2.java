package week13;

import java.util.Arrays;
import java.util.List;

public class LambdaExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        // 람다식 방법
        names.forEach(name -> System.out.println(name));
        // 인스턴스 메소드 방법
        names.forEach(System.out::println);
    }
}
