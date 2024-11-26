package week13;

import java.util.Arrays;
import java.util.List;

public class StreamFilter1 {
	public static void main(String[] args) {
		   int[] ar = {1, 2, 3, 4, 5};
		   Arrays.stream(ar)   // 배열 기반 스트림 생성
		         .filter(n -> n%2 == 1)   // 홀수만 통과시킨다.
		         .forEach(n -> System.out.print(n + "\t"));
		   System.out.println();

		   List<String> sl = Arrays.asList("Toy", "Robot", "Box");
		   sl.stream()   // 컬렉션 인스턴스 기반 스트림 생성
		     .filter(s -> s.length() == 3)   // 길이가 3이면 통과시킨다.
		     .forEach(s -> System.out.print(s + "\t"));
		   System.out.println();
		}

}
