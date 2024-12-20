package week10.test;
import java.util.Objects;

public class Student {
    String stdId;
    String name;
    String dept;

    public Student(String stdId, String name, String dept) {
        this.stdId = stdId;
        this.name = name;
        this.dept = dept;
    }

    public String getStdId() {
        return this.stdId;
    }
    public String getName() {
        return this.name;
    }

    public String getDept() {
        return this.dept;
    }

    public String toString() {
        return "Student{" +
                "stdId='" + stdId + '\'' +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass()!= obj.getClass()) return false;
        Student other = (Student) obj;
        return Objects.equals(Student.class, other.stdId);
    }
}
