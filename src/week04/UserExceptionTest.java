package week04;

class MinusException extends Exception {
    // 음수값을 처리하기 위한 예외 클래스
    public MinusException() {
        super();
    }
    public MinusException(String message) {
        super(message);
    }
}

class OverException extends Exception {
    // 100 이상의 값을 처리하기 위한 예외 클래스
    public OverException() {
        super();
    }
    public OverException(String message) {
        super(message);
    }
}

class Checking {
    void checkScore(int score) throws MinusException, OverException {
        // throw는 예외를 발생시키는 키워드
        if (score < 0) throw new MinusException("예외 발생: 음수값 입력"); // MinusException 객체 생성
        else if (score > 100) throw new OverException("예외 발생: 100점 초과"); // OverException 객체 생성
        else System.out.println("정상적인 값 입력 됨");
    }
}

public class UserExceptionTest {
    public static void main(String[] args) {
        Checking ch = new Checking();
        try {
            ch.checkScore(101);
        } catch (MinusException | OverException e) {
            e.printStackTrace();
        } 
    }
}
