package week07;

class Apple{}
class Pencil{}

class Basket<T>{
    public void putIn(T something){}
}

class Goods<T> {
    T obj;

    public T getObj() {
        return this.obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

}

public class GenericTest03 {
    public static void main(String[] args) {
        Goods<String> gs = new Goods<String>();
        gs.setObj("키보드");
        String Word = gs.getObj();
        System.out.println(Word);
        Goods<Integer> gs1 = new Goods<Integer>();
        // 제네릭인터페이스의 타입을 스트링으로
        Basket<String> b = new Basket<String>() {
            @Override
            public void putIn(String something) {
                System.out.println(something + " 담았다.");
            }
        };
        b.putIn("신발을");

        //제네릭인터페이스의 타입을 애플로
        Basket<Apple> b2 = new Basket<Apple>() {
            @Override
            public void putIn(Apple something) {
                System.out.println(something + " 담았다.");
            }
        };
        b2.putIn(new Apple()); // week07.Apple@8bcc55f 담았다.에서 앞부분은 고유의 해시코드임
    }
}
