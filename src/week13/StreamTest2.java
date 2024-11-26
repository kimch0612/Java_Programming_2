package week13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
}
public class StreamTest2 {

	public static void main(String[] args) {
		List<Member> members = Arrays.asList(
				new Member("minsu", 30),    
				new Member("samsu", 20),    
				new Member("bansu", 23),
				new Member("minsu", 25)
			 );
		// 1. age로 오름차순
		System.out.println("======== 1. age로 오름차순================");
		members.stream()
		.sorted(Comparator.comparing((Member m) -> m.getAge()))
//		.sorted(Comparator.comparing(Member::getAge)) 
		.forEach(System.out::println); // 출력
		
		// 2. age로 내림차순
		System.out.println("======== 2. age로 내림차순================");
		members.stream()
		.sorted(Comparator.comparing(Member::getAge).reversed()) 
		.forEach(System.out::println); // 출력
		
		// 3. 이름으로 오름차순
		System.out.println("======== 3. 이름으로 오름차순================");
		members.stream()
			.sorted(Comparator.comparing(Member::getName))
			.forEach(System.out::println); 

		// 4. 이름으로 역순정렬
		System.out.println("======== 4. 이름으로 내림차순================");
		members.stream()
				.sorted(Comparator.comparing(Member::getName).reversed())
				.forEach(System.out::println); 
		
		// 5. 1차는 이름으로 2차는 나이로 정렬
//		Comparator<Member> compName = Comparator.comparing(Member::getName);
		System.out.println("======== 5. 1차는 이름으로 2차는 나이로 정렬 ================");
		members.stream()
			.sorted(Comparator.comparing(Member::getName)
//			.sorted(compName
					.thenComparing(Member::getAge)) // 정렬기준 추가
			.forEach(System.out::println); 
	}

}
