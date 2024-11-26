package week13;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class MatchTest1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11);
//		int cnt = numbers.stream()
//				.map(a->1)
//				.peek(System.out::println)
//				.reduce(0, Integer::sum); // 합계 계산
//				.reduce(0, (a,b)->a+b);
//		System.out.println("갯수는 map" + cnt);

		List<Integer> numbers1 = Arrays.asList(2, 4, 6, 8, 10);
		long cnt2 = numbers1.stream().count();
		System.out.println("갯수는 count()" + cnt2);
		
		boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
		System.out.println("모든 요소가 짝수인가? " + allEven); // 출력: true

		List<Integer> numbers2 = Arrays.asList(1, 3, 5, 7, 9);
		boolean noEven = numbers2.stream().noneMatch(n -> n % 2 == 0);
		System.out.println("어떤 요소도 짝수가 아닌가? " + noEven); // 출력: true

		List<Integer> numbers3 = Arrays.asList(1, 3, 5, 7, 8);
		boolean hasEven = numbers3.stream().anyMatch(n -> n % 2 == 0);
		System.out.println("하나 이상의 요소가 짝수인가? " + hasEven); // 출력: true
	}
}