package week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrTest {
    public static void main(String[] args) {
        // String[] Animal = new String[5];
        // Animal[0] = "개";
        // Animal[1] = "고양이";
        // Animal[2] = "새";
        // Animal[3] = "달팽이";
        // Animal[4] = "거미";
        // for (int i = 0; i < Animal.length; i++) {
        //     System.out.println(Animal[i]);
        // }
        // System.out.println(Arrays.toString(Animal));
        // System.out.println("Animal 개수: " + Animal.length);

        List <String> fruit = new ArrayList<String>();
        System.out.println("fruit 개수: " + fruit.size());
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("cherry");
        System.out.println(fruit.toString());
        System.out.println("fruit 개수: " + fruit.size());
        //fruit.remove("2");
        //fruit.remove("cherry");
        fruit.set(0, "Strawberry");
        System.out.println(fruit.toString());
        fruit.clear();
        System.out.println(fruit.toString());
        System.out.println(fruit.isEmpty());
        fruit.addAll(fruit);
        System.out.println("add all :" + fruit);

        List<String> animals = new ArrayList<>();
        animals.add("cats");
        animals.add("dogs");
        fruit.addAll(animals);
        System.out.println("add all :" + fruit);
    }
}
