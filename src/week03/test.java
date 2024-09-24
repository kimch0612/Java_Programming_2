package week03;

import java.io.InputStreamReader;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        // try {
        //     System.out.println(3/0);
        // }
        // catch(ArithmeticException e) {
        //     System.out.println("숫자는 0으로 나눌 수 없습니다.");
        // }
        // finally {
        //     System.out.println("종료합니다.");
        // }
        try (InputStreamReader is = new InputStreamReader(System.in);) {
            System.out.println(is.read());
        } catch (IOException e) {
            System.out.println("Hi");
        } finally {
            System.out.println("Hello");
        }
    }
}

// 지난 주 code review

/*

*/