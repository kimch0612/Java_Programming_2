package week10.set;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<String>();
        tSet.add("tree1");
        tSet.add("flower");
        tSet.add("weed");
        System.out.println(tSet);

        TreeSet<Integer> iSet = new TreeSet<>();
        iSet.add(88);
        iSet.add(46);
        iSet.add(120);
        System.out.println(iSet);
    }
}
