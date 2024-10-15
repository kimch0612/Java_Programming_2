package week07;

class A{}
class B extends A{}
class C extends B{}
class D <T extends B> { // T타입으로 클래스 B, C를 사용 가능함
    private T t;
    public T get() { return this.t; }
    public void set(T t) { this.t = t; }

}

public class BoundGenericClass {
    public static void main(String[] args) {
        // D<A> d1 = new D<>(); B랑 C만 가능하므로 A는 불가능함
        D<B> d2 = new D<>();
        D<C> d3 = new D<>();
        D d4 = new D(); // D<B> d2 = new D<>();와 동일함

        d2.set(new B());
        d2.set(new C());

        d3.set(new C());
        //d3.set(new B()); 불가능함

        d4.set(new B());
        d4.set(new C());
    }
}
