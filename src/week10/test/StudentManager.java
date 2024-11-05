package week10.test;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> stdList = new ArrayList<>();
    
    public void addStudent(Student student) {
        if (!stdList.contains(student)) {
            stdList.add(student);
            System.out.println(student.getName() + "추가 완료");
        }
        else {
            System.out.println(student.getName() + "은(는) 이미 존재하는 학생입니다.");
        }
    }
    public void displayAllStudents() {
        for (Student s : stdList) {
            System.out.println(s.getName());
        }
    }
    public void searchStudent(String stdId) {
        for (Student s : stdList) {
            if (s.getStdId().equals(stdId)) {
                System.out.println(stdId + " 아이디가 존재합니다.");
                return;
            }
        }
        System.out.println(stdId + " 아이디는 존재하지 않습니다.");
    }
    public void removeStudent(String stdId) {
        for (Student s : stdList) {
            if (s.getStdId().equals(stdId)) {
                System.out.println(s.getStdId() + " 아이디 삭제 완료");
                stdList.remove(s);
                return;
            }
        }
        System.out.println(stdId + " 아이디는 존재하지 않습니다.");
    }
}
