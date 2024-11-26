package week13;

import java.util.List;
class Printing{
	public static <T> void print(T t) {
        System.out.print(t + "  ");
    }
}
public class StreamMemberTest {
    public static void main(String[] args) {
        List<Member> members = List.of(new Member("홍길동", Gender.남, 25),
                new Member("배장화", Gender.여, 20),
                new Member("임꺽정", Gender.남, 29),
                new Member("연흥부", Gender.남, 28),
                new Member("김선달", Gender.남, 32),
                new Member("황진이", Gender.여, 18));

        members.stream()
        		.map(m -> m.getName())
        		.filter(n -> n.charAt(0) < '이')
        		.forEach(Printing::print);
        System.out.println();

        double avgAge = members.stream()
        		.mapToInt(m -> m.getAge())
        		.average()
        		.getAsDouble();
        System.out.println(avgAge);

        members.stream()
        		.filter(m -> m.getAge() > 19 && m.getAge() < 30)
                .forEach(m -> System.out.println(m.getName() + " " + m.getGender()));
    }
}

enum Gender {
    남, 여
}

class Member {
    String name;
    Gender gender;
    int age;

    public Member(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("Member(%s, %s, %d)", name, gender, age);
    }
}
