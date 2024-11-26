package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class ToyPriceInfo { // 장난감 모델 별 가격 정보
	private String model; // 모델 명
	private int price; // 가격

	public ToyPriceInfo(String m, int p) {
		model = m;
		price = p;
	}

	public int getPrice() {
		return price;
	}
}

public class StreamMapping2 {
	public static void main(String[] args) {
		   List<ToyPriceInfo> ls = new ArrayList<>();
		   ls.add(new ToyPriceInfo("GUN_LR_45", 200));
		   ls.add(new ToyPriceInfo("TEDDY_BEAR_S_014", 350));
		   ls.add(new ToyPriceInfo("CAR_TRANSFORM_VER_7719", 550));

		   int sum = ls.stream()
		               .filter(p -> p.getPrice() < 500)
		               .mapToInt(t -> t.getPrice())
		               .sum();
		   System.out.println("sum = " + sum);
		   
		   // flatMap 활용
		   Stream<String> ss1 = Stream.of("MY_AGE", "YOUR_LIFE");
		   
		   // 아래 람다식에서 스트림을 생성
		   Stream<String> ss2 = ss1.flatMap(s -> Arrays.stream(s.split("_")));
//		   ss1.forEach(s -> System.out.print(s + "\t"));
		   ss2.forEach(s -> System.out.print(s + "\t"));
		   System.out.println();

		   
		}

}
