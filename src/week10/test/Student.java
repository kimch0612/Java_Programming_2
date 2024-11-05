package week10.test;

class StudentManager {

}

public class Student {
    String stdId;
    String name;
    String dept;

    public String getStdId() {
        return this.stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
  // 학생 추가
        manager.addStudent(new Student("2023001", "철수", "컴퓨터소프트웨어학과"));
        manager.addStudent(new Student("2023002", "영희", "수학과"));
        manager.addStudent(new Student("2023003", "찰스", "보건과"));
  
  // 모든 학생 출력
        manager.displayAllStudents();          System.out.println("-".repeat(20));
  // 영희 학생 검색
        manager.searchStudent("2023002");    System.out.println("-".repeat(20));
  
  // 철수 학생 삭제
        manager.removeStudent("2023001");  System.out.println("-".repeat(20));
  
  // 철수 학생 재검색 (삭제된 학생)
        manager.searchStudent("2023001");    System.out.println("-".repeat(20));
  // 최종 학생 목록 출력
        manager.displayAllStudents();
     }
}
