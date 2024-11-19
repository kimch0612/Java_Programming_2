package week12;

interface Animal {
    void cry();
}

interface Maxible {
    int max(int a, int b);
}

public class AnimalMain {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            public void cry() {
                System.out.println("야옹");
            }
        }; cat.cry();
        Animal dog = () -> System.out.println("멍멍"); dog.cry();

        Maxible max = (a, b) -> a>b ? a:b;
        max.
    }
}
