package week07;

class Apple{}
class Pencil{}

class Basket<T>{
    T obj;

    public T getObj() {
        return this.obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void putIn(){}

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

        Basket<String> b = new Basket<String>() {
            @Override
            public void putIn(String something) {
                // TODO Auto-generated method stub
                super.putIn();
            }
        };
    }
}
