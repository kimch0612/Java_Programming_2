package week04;

// ScriptThread 클래스의 run 메소드 내에서는 자막을 송출하는 기능을 재정의함
class ScriptTread extends Thread {
    @Override
    public void run() {
        String stript[] = {"하나", "둘", "셋"};
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {}
        for (String str : stript) {
            System.out.println("[자막 스크립트] - " + str);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {}
        }
    }
}


// main 쓰레드: 비디오 프레임(장면) 송출하는 기능
public class UseThread1 {
    public static void main(String[] args) {
        ScriptTread script = new ScriptTread();
        script.start();

        int[] scene = {1, 2, 3};
        for (int num:scene) {
            System.out.print("[비디오 프레임] - " + num + "   ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {}
        }
    }
}
