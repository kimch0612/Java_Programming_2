package week13;

import java.util.Arrays;
import java.util.List;

public class StreamMapping1 {
	public static void main(String[] args) {
		   List<String> ls = Arrays.asList("Box", "Robot", "Simple");
		   ls.stream()
		     .map(s -> s.length())
		     .forEach(n -> System.out.print(n + "\t"));
		   System.out.println();
		   
		   ls.stream()
		     .mapToDouble(s -> s.length())
		     .forEach(n -> System.out.print(n + "\t"));
		   System.out.println();

		}

}
