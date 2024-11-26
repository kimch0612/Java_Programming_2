package week13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NoStreamStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("이자바", 3, 300));
        studentList.add(new Student("김자바", 1, 200));
        studentList.add(new Student("안자바", 2, 100));
        studentList.add(new Student("박자바", 2, 150));
        studentList.add(new Student("소자바", 1, 200));
        studentList.add(new Student("나자바", 3, 290));
        studentList.add(new Student("감자바", 3, 180));

        // 반별 정렬 및 기본 정렬(총점 내림차순)
        Collections.sort(studentList, Comparator.comparing(Student::getBan)
                                                .thenComparing(Comparator.naturalOrder()));

        // 출력
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}

class Student2 implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    Student2(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
    }

    String getName() { return name; }
    int getBan() { return ban; }
    int getTotalScore() { return totalScore; }

    // 총점 내림차순을 기본 정렬로 한다.
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}
