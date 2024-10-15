package week07;

class GenericM{
    public <T> T method1(T t) {
        return t;
        //return t.length(); 메소드 내에서 사용할 변수의 타입이 아직 정해지지 않았으므로 사용 불가
        // t변수에 대해 사용할 수 있는 메소드는 object의 메소드밖에 없음
    }

    public <T> boolean method2(T t1, T t2) {
        return t1.equals(t2);
    }

    public <K,V> void method3(K k, V v) {
        System.out.println(k + " : " + v);
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        GenericM gm = new GenericM();
        String str1 = gm.<String>method1("Hello");
        String str2 = gm.method1("Hello"); // t타입의 자료형에 맞춰서 String이 자동으로 들어감
        int num1 = gm.method1(100);

        boolean b1 = gm.<Double>method2(3.14, 3.15);
        boolean b2 = gm.method2("Java", "Java");
        System.out.println(b1 + " " + b2);

        gm.<String, Integer>method3("국어", 100);
    }
}
