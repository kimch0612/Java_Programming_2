package week12;

interface A { // 입력X, 출력X
    void method1();
}

interface B { // 입력O, 출력X
    void method2(int a);
}

interface C { // 입력X, 출력O
    int method3();
}

interface D { // 입력O, 출력O
    double method4(int a, double b);
}

public class LambdaTest1 {
    public static void main(String[] args) {
        A a = () -> System.out.println("Method1");
        B b = aa -> System.out.println(aa);
        C c = () -> 42;
        D d = (aaa, bbb) -> aaa + bbb;

        a.method1();
        b.method2(10);
        System.out.println(c.method3());
        System.out.println(d.method4(10000000, 20000000));
    }
}