package week07;

// Apple과 Pencil을 모두 담을 수 있는 상품 클래스 Goods

class Goods {
    Object obj;
    public Object getObj() {
        return this.obj; // 이 메소드의 리턴 타입은 오브젝트
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

}

public class GenericTest02 {
    public static void main(String[] args) {
        Goods gs1 = new Goods();
        gs1.setObj(new Apple()); // 사과를 담은 객체 gs1
        // Apple ap = gs1.getObj();
        // Object obj = gs1.getObj();
        Apple ap = (Apple)gs1.getObj();

        gs1.setObj(new Pencil());
        Pencil pen = (Pencil)gs1.getObj();
    }
}
