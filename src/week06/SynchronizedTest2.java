package week06;

class mydata {
    synchronized void abc() {
        for (int i=0; i<3; i++) {
            System.out.println(i + "sec");
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }

    synchronized void bcd() {
        for (int i=0; i<3; i++) {
            System.out.println(i + "초");
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }

    void cde() {
        synchronized (this) {
            for (int i=0; i<3; i++) {
                System.out.println(i + "번째");
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        }
    }
}

public class SynchronizedTest2 {
    public static void main(String[] args) {
        mydata md = new mydata();

        new Thread() {
            public void run() {
                md.abc();
            }
        }.start();

        new Thread() {
            public void run() {
                md.bcd();
            }
        }.start();

        new Thread() {
            public void run() {
                md.cde();
            }
        }.start();
    }
}
