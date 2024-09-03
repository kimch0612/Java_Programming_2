package week01;

public class review {
    public static void main(String[] args) {
        System.out.println("Wa!");
        System.out.println("Sans!!");

    }
}
// int double long char boolean float short byte String
// byte short int long char float double boolean String
// float c = 2.1; == 에러 발생; constant pool에서는 8bytes짜리 double이라
// float c = 2.1f;를 입력해야 정상적으로 사용 가능

/*
선택제어문
if-else

반복제어문
for while do=while for-each

제어키워드
continue break
*/

// 클래스와 객체?
// 클래스는 하나의 틀 (붕어빵 기계)이며, 객체는 틀을 이용해서 만들어낸 요소 (붕어빵)이다.

/*
 * abstract class Person { } 추상클래스
 * abstract public void disp(); 추상메소드 (불완전)
 * 추상메소드가 하나라도 있는 클래스는 추상메소드가 됨
 * public void disp() { System.out.println("Hi!"); }
 * 불완전->완전으로 하는 것이 '구현'임
 * 1. 추상 클래스에 추상메소드가 있는 경우 -> 하위클래스에서 구현
 * 2. 인터페이스 내의 추상메소드가 있는 경우 -> 하위클래스에서 구현
 * 추상메소드가 모여있는 것이 인터페이스임?
 */