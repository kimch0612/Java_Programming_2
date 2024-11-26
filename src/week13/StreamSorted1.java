package week13;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSorted1 {
	public static void main(String[] args) {
		IntStream.of(3, 9, 4, 2)
				.sorted()
				.forEach(d -> System.out.print(d + "\t"));
		System.out.println();
		
		var numbers = List.of(5, 2, 3, 9, 4);
		numbers.stream()
		       .sorted(Comparator.reverseOrder())
//		       .collect(Collectors.toList())
		       .forEach(a -> System.out.print(a + "\t"));
		System.out.println();

		DoubleStream.of(3.3, 6.2, 1.5, 8.3)
				.sorted()
				.forEach(d -> System.out.print(d + "\t"));
		System.out.println();

		Stream.of("Box", "Apple", "Robot").sorted()
				// String 인스턴스는 Comparable<String> 인터페이스를 구현! 이를 기반으로 한 정렬
				.forEach(s -> System.out.print(s + '\t'));
		System.out.println();

		Stream.of("Box", "Apple", "Rabbit").sorted((s1, s2) -> s1.length() - s2.length())
				// compareTo 메소드에 대한 람다식! 이를 기반으로 한 정렬
				.forEach(s -> System.out.print(s + '\t'));
		System.out.println();
	}
}
