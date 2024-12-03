package week14.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
	private static List<Student> studentList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	// 학생 성적 입력
	public void addStudent() {
		System.out.print("학번: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // 버퍼 비우기

		System.out.print("이름: ");
		String name = scanner.nextLine();

		System.out.print("Java 성적: ");
		int java = scanner.nextInt();

		System.out.print("C 성적: ");
		int c = scanner.nextInt();

		System.out.print("Python 성적: ");
		int python = scanner.nextInt();

		studentList.add(new Student(id, name, java, c, python));
		System.out.println("학생 정보가 추가되었습니다.");
	}

	// 학생 검색
	public void searchStudent() {
		System.out.print("검색할 학생의 학번: ");
		int id = scanner.nextInt();

		for (Student student : studentList) {
			if (student.getId() == id) {
				System.out.println(student);
				return;
			}
		}
		System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
	}

	// 전체 출력
	public void printAllStudents() {
		if (studentList.isEmpty()) {
			System.out.println("등록된 학생이 없습니다.");
			return;
		}

		studentList.stream().sorted(Comparator.comparingInt(Student::getTotalScore).reversed())
				.forEach(System.out::println);
	}

	// 학생 성적 수정
	public void updateStudent() {
		System.out.print("수정할 학생의 학번: ");
		int id = scanner.nextInt();

		for (Student student : studentList) {
			if (student.getId() == id) {
				System.out.println("현재 학생 정보: " + student);

				System.out.print("새 Java 성적: ");
				int java = scanner.nextInt();

				System.out.print("새 C 성적: ");
				int c = scanner.nextInt();

				System.out.print("새 Python 성적: ");
				int python = scanner.nextInt();

				student.setJava(java);
				student.setC(c);
				student.setPython(python);

				System.out.println("학생 정보가 수정되었습니다.");
				return;
			}
		}
		System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
	}
}
