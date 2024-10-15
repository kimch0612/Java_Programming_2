package week07;

class AA {
    public void method1(String t) {
        System.out.println(t.charAt(0));
    }
}

interface MyInterface {
    public abstract void print();
}

class BB {
    public <T extends MyInterface> void method1(T t) {
        t.print();
    }
}

public class BoundGenericMethod {
    public static void main(String[] args) {
        AA a = new AA();
        a.method1("안녕 ");

        BB b = new BB();
        b.method1(new MyInterface() {
            @Override
            public void print() {
                System.out.println("print() 구현");
            }
        });
    }
}
