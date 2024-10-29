package week09;

class Counter {
    private int count = 0;
    public void increment() { count += 1; }
    public int getCount() { return count; }
}

class MyThread extends Thread {
    Counter count;
    public MyThread(Counter count) { this.count = count; } // 접근 제어자만 있고 리턴타입이 없으므로 생성자
    public void run() {
        for(int i = 0; i < 100000; i++) {
            count.increment();
        }
    }
}

public class CounterTest {
    public static void main(String[] args) throws InterruptedException {
        Counter cnt = new Counter();
        Thread th1 = new MyThread(cnt);
        th1.start();
        Thread th2 = new MyThread(cnt);
        th2.start();
        th1.join();  // th1이 다 끝날 때까지 대기
        th2.join();
        System.out.println(cnt.getCount());
    }
}
