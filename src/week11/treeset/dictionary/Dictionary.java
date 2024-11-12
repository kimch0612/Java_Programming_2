package week11.treeset.dictionary;

public class Dictionary implements Comparable<Dictionary> {
    private String english;
    private String korean;

    public String getEnglish() {
        return this.english;
    }
    public void setEnglish(String english) {
        this.english = english;
    }
    public String getKorean() {
        return this.korean;
    }
    public void setKorean(String korean) {
        this.korean = korean;
    }
    public int compareTo(Dictionary other) {
        return this.english.compareTo(other.getEnglish());
    }
    public Dictionary(String english, String korean) {
        super();
        this.english = english;
        this.korean = korean;
    }
    public String toString() {
        return "English: " + english + " / Korean: " + korean;
    }
}
