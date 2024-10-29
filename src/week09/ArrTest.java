package week09;

public class ArrTest {
    public static void main(String[] args) {
        String[] Animal = new String[5];
        Animal[0] = "개";
        Animal[1] = "고양이";
        Animal[2] = "새";
        Animal[3] = "달팽이";
        Animal[4] = "거미";
        for (int i = 0; i < Animal.length; i++) {
            System.out.println(Animal[i]);
        }
    }
}
