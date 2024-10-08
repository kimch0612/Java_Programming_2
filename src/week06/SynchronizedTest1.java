// package week06;

// class MyData {
//     int data = 3;

//     public void plusData() {
//         int mydata = data;
//         try { Thread.sleep(2000); } catch (InterruptedException e) { }
//         data=mydata+1;
//     }
// }

// class PlusThread extends Thread {
//     MyData myData;
//     public PlusThread(MyData myData) {
//         this.myData = myData;
//     }
//     public void run() {
//         myData.plusData();
//         System.out.println(getName() + " 실행 결과: " + myData.data);
//     }
// }

// public class SynchronizedTest1 {
//     public static void main(String[] args) {
//         MyData myData = new MyData();

//         Thread plusThread1 = new PlusThread(myData);
//         plusThread1.setName("plusThread1");
//         plusThread1.start();

//         try { Thread.sleep(1000); } catch (InterruptedException e) {}

//         Thread plusThread2 = new PlusThread(myData);
//         plusThread2.setName("plusThread2");
//         plusThread2.start();
//     }
// }

package week06;

class MyData {
    int data = 3;

    public void plusData() {
        // int mydata = data;
        // try { Thread.sleep(2000); } catch (InterruptedException e) { }
        // data=mydata+1;
        // 블록 동기화
        synchronized(this) { // this 대신 임이의 객체 (예: new Object()) 사용
            int num = data; // 값 읽기
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
            data = num + 1; // 다른 스레드에게 개입 여지를 주기 위해 2초 대기 후 1 증가
        }
    }
}

class PlusThread extends Thread {
    MyData myData;
    public PlusThread(MyData myData) {
        this.myData = myData;
    }
    public void run() {
        myData.plusData();
        System.out.println(getName() + " 실행 결과: " + myData.data);
    }
}

public class SynchronizedTest1 {
    public static void main(String[] args) {
        MyData myData = new MyData();

        Thread plusThread1 = new PlusThread(myData);
        plusThread1.setName("plusThread1");
        plusThread1.start(); // plusThread1 실행 결과: 4

        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        Thread plusThread2 = new PlusThread(myData);
        plusThread2.setName("plusThread2");
        plusThread2.start(); // plusThread2 실행 결과: 5
    }
}
