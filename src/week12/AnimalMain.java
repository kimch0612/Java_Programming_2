package week12;

interface Animal {
    void cry();
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
    }
}
