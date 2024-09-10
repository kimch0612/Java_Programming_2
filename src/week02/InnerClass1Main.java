package week02;

class A {
    public int a = 3;
    protected int b = 4;
    int c = 5;
    private int d = 6;

    void abc() {
        System.out.println("A 클래스 메소드");
    }

    class B {
        void bcd() {
            // 1. outer class 필드 사용
            System.out.println("a");
            System.out.println("b");
            System.out.println("c");
            System.out.println("d");
            // 2. outer class 메소드 사용
            abc();
        }
    }
}

public class InnerClass1Main {
    public static void main(String[] args) {
        // 3. instance inner class 객체 생성
        // 3.1 outer class 객체 생성
        A a = new A();

        // 3.1 outer 참조 변수로부터 inner 클래스 객체 생성
        A.B b = a.new B();
        b.bcd();
    }
}
