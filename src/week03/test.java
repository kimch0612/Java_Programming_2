package week03;

import java.io.InputStreamReader;

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
        try {
            is = new InputStreamReader(System.in);
            System.out.println(is.read());
        } catch (IOException e) {
            System.out.println("Hi");
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    System.out.println("Hello");
                }
            }
        }
    }
}

// 지난 주 code review

/*

*/