package week13;

interface Adder {
    int add(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        Adder adder = (a, b) -> a + b;
        System.out.println(adder.add(3, 5));
    }
}
