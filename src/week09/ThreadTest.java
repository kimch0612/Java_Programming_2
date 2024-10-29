package week09;

class Thread1 extends Thread {
    public void run() {
        System.out.println("*".repeat(30));
    }
}

class Thread2 implements Runnable {
    public void run() {
        System.out.println("*".repeat(30));
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        // Thread1 thd = new Thread1();
        // thd.start();
        Thread2 thd = new Thread2();
        Thread th = new Thread(thd);
        th.start();
    }
}
