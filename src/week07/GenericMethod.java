package week07;

class GenericM{
    public <T> T method1(T t) {
        return t;
    }

    public <T> boolean mothod2(T t1, T t2) {
        return t1.equals(t2);
    }

    public <K,V> void method3(K k, V v) {
        System.out.println(k + " : " + v);
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        
    }
}
