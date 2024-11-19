package week12;

interface Adder {
    void add(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        Adder adder = (a, b) -> System.out.println(a+b);
        adder.add(1, 2);
    }
}
