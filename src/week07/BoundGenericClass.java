package week07;

class A{}
class B extends A{}
class C extends B{}
class D <T extends B> { // T타입으로 클래스 B, C를 사용 가능함

}

public class BoundGenericClass {
    public static void main(String[] args) {
        
    }
}
