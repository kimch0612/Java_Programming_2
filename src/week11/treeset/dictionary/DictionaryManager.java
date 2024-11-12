package week11.treeset.dictionary;

import java.util.Set;
import java.util.TreeSet;

public class DictionaryManager {
    private Set<Dictionary> dictionarySet;

    public DictionaryManager() {
        this.dictionarySet = new TreeSet<>();
    }

    public void addWord(String english, String korean) {
        Dictionary dictionary = new Dictionary(english, korean);
        if (dictionarySet.add(dictionary)) {
            System.out.println("단어 추가 성공");
        } else {
            System.out.println("중복된 단어입니다: " + english);
        }
    }
    public void removeWord(String english) {
        Dictionary target = new Dictionary(english, null);
        if (dictionarySet.contains(target)) {
            dictionarySet.remove(target);
            System.out.println(english + "단어 삭제 성공");
        } else {
            System.out.println(english + "해당 단어가 존재하지 않습니다.");
        }
    }

    public void updateWord(String english, String newKorean) {
        Dictionary target = new Dictionary(english, null);
        if (dictionarySet.contains(target)) {
            Dictionary updatedDictionary = new Dictionary(english, newKorean);
            dictionarySet.remove(target);
            dictionarySet.add(updatedDictionary);
            System.out.println(english + " 단어 수정 성공");
        } else {
            System.out.println(english + " 해당 단어가 존재하지 않습니다.");
        }
    }

    // public void searchWord(String english) {
    //     Dictionary target = new Dictionary(english, null);
    //     if (dictionarySet.contains(target)) {
    //         Dictionary foundDictionary = dictionarySet.stream()
    //                                                .filter(dictionary -> dictionary.getEnglish().equals(english))
    //                                                .findFirst()
    //                                                .orElse(null);
    //         if (foundDictionary!= null) {
    //             System.out.println(foundDictionary.getEnglish() + " - " + foundDictionary.getKorean());
    //         } else {
    //             System.out.println(english + " 단어를 찾지 못했습니다.");
    //         }
    //     } else {
    //         System.out.println(english + " 해당 단어가 존재하지 않습니다.");
    //     }
    // }

    public void searchWord(String english) {
        for(Dictionary tmp : dictionarySet) {
            if (tmp.getEnglish().equals(english)) {
                System.out.println(tmp + " 검색 성공");
            }
        }
        System.out.println(english + " 찾을 수 없음");
    }

    public void displayAllWords() {
        if (dictionarySet.isEmpty()) {
            System.out.println("사전 목록이 비어있습니다.");
            return ;
        }
        for (Dictionary dict : dictionarySet) {
            System.out.println(dict.toString());
        }
    }
}

