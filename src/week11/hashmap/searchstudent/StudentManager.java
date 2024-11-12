package week11.hashmap.searchstudent;

import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    Map<String, Student> StdHashMap = new HashMap<>();

    public void addStudent(Student std) {
        StdHashMap.put(std.getId(), std);
    }

    public Student getStudentById(String id) {
        return StdHashMap.get(id);
    }

    public void displayAllStudents() {
        for (Map.Entry<String, Student> entry : StdHashMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
