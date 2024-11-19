package week12;

@FunctionalInterface // 단 하나의 추상메소드만 가진다는 뜻
interface ArrayPrinter {
    void print(int[] arr);
}

public class LambdaExample2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayPrinter printer = (array) -> {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        };
        printer.print(arr);
    }
}
