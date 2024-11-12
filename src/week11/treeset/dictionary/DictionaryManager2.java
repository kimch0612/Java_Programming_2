package week11.treeset.dictionary;

import java.util.Comparator;
import java.util.TreeSet;

public class DictionaryManager2 {
    TreeSet<Dictionary> dicTree;
    public DictionaryManager2() {
        dicTree = new TreeSet<>(new Comparator<Dictionary>() {
            @Override
            public int compare(Dictionary o1, Dictionary o2) {
                return o1.getEnglish().compareTo(o2.getEnglish());
            };
        });
    }
}
