package week09;

class Thread1 extends Thread {
    public void run() {
        System.out.println("*".repeat(30));
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Thread1 thd = new Thread1();
        thd.start();
    }
}
