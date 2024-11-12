package week11.hashmap.searchstudent;

import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    Map<String, Student> StdHashMap = new HashMap<>();

    public void addStudent(Student std) {
        StdHashMap.put(std.getId(), std);
        System.out.println(std + " 추가 성공");
    }

    public void getStudentById(String id) {
        Student std = StdHashMap.get(id);
        if (std != null) {
            System.out.println(std + " 검색 성공");
        } else {
            System.out.println(std + " 검색 실패");
        }
    }

    public void displayAllStudents() {
        for (Map.Entry<String, Student> entry : StdHashMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
