package week07;

class Apple {}
// Apple을 담을 수 있는 상품 class를 만들 것임
class Goods1 {
    Apple apple;
    public Apple getApple() {
        return apple;
    }
    public void setApple(Apple apple) {
        this.apple = apple;
    }

}
class Pencil {}
// Pancel을 담을 수 있는 상품 class를 만들 것임
class Goods2 {
    Pencil pencil;
    public Pencil getPencil() {
        return this.pencil;
    }

    public void setPencil(Pencil pencil) {
        this.pencil = pencil;
    }

}

public class GenericTest01 {
    public static void main(String[] args) {
        // 사과 저장한 후 꺼내오기
        Goods1 gs1 = new Goods1(); // 사과를 위한 저장소
        gs1.setApple(new Apple());
        Apple ap = gs1.getApple();

        // 연필 저장 후 꺼내오기
        Goods2 gs2 = new Goods2();
        gs2.setPencil(new Pencil());
        Pencil pn = gs2.getPencil();
    }
}
