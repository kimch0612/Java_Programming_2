package week13;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // Arrays.stream(arr);
        // Stream<Integer> intStream = Arrays.stream(arr); 타입이 Stream이 아니라 IntStream임
        IntStream intStream = Arrays.stream(arr);

        String[] strArr = {"Bird", "Flower", "Fire"};
        Stream<String> stream = Stream.of(strArr)
                                      .filter(s->s.length()>=5)
                                      .distinct()
                                      .sorted()
                                      .limit(2);
        long total = stream.count(); // 최종연산
        System.out.println(total);
        // stream.forEach(System.out::println);
    }
}
