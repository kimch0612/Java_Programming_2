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
            System.out.println("a");
            System.out.println("b");
            System.out.println("c");
            System.out.println("d");
            abc();
        }
    }
}

public class InnerClass1Main {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.bcd();
    }
}
