package week09;

public class ExceptionPropagationExample {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static int divideNumbers(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
