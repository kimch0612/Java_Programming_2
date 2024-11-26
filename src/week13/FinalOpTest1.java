package week13;

import java.util.stream.IntStream;

public class FinalOpTest1 {

	public static void main(String[] args) {
		 IntStream.range(1, 10).sequential().forEach(System.out::print); // 123456789
		 System.out.println("\n-------------");
		 IntStream.range(1, 10).sequential().forEachOrdered(System.out::print); // 123456789
		 System.out.println("\n-------------");
		 IntStream.range(1, 10).parallel().forEach(System.out::print);// ?
		 System.out.println("\n-------------");
		 IntStream.range(1, 10).parallel().forEach(System.out::print); // ?
		 System.out.println("\n-------------");
		 IntStream.range(1, 10).parallel().forEachOrdered(System.out::print); // 123456789
		
	}

}
