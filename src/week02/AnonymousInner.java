package week02;

interface ifA {
    void print();
}

// class ifClass implements ifA { // 익명클래스
//     public void print() {

//     }
// } 첫번째 방법

public class AnonymousInner {
    public static void main(String[] args) {
        // ifA ifa = new ifA(); 사용 불가능함
        // ifA ifa = new ifClass(); 첫번째 방법
        ifA ifa = new ifA() { // 두번째 방법
            public void print() {}
        };
        ifa.print();
    }
}
