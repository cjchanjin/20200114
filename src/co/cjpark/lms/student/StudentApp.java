package co.cjpark.lms.student;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
	StudentServiceImpl student = new StudentServiceImpl();
	Scanner sc = new Scanner(System.in);
	StudentDto dto = new StudentDto();

	public void selectAll() { // 전체학생보기 실행구문
		List<StudentDto> list = new ArrayList<StudentDto>();
		list = student.allStudent();
		studentList(list);
	}

	public void select() {
		dto = new StudentDto();
		System.out.println("검색할 학번을 입력하세요");
		dto.setStudent_id(sc.next());
		dto = student.select(dto);
		searchStudent(dto);
		sc.nextLine();
	}

	public void insert() {
		dto = new StudentDto();

		do { 				// 입력한 학번 체크
			System.out.println("입력할 학생의 학번을 입력하세요");
			dto.setStudent_id(sc.nextLine());
			boolean b = student.isCheckId(dto.getStudent_id());
			if (!b) {
				System.out.println("이미 존재하는 학번 입니다.");
			} else {
				System.out.println("입력된 아이디는 사용가능한 학번입니다.");
				break;
			}
		} while (true);

		System.out.println("학생 이름을 입력하세요");
		dto.setStudent_name(sc.nextLine());
		System.out.println("학과코드를 입력하세요");
		dto.setStudent_dept(sc.nextLine());
		System.out.println("생년월일을 입력하세요");
		dto.setStudent_birthday(Date.valueOf(sc.nextLine()));
		int n = student.insert(dto);
		if (n != 0) {
			System.out.println("정상적으로 입력하였습니다.");
			selectAll();
		} else {
			System.out.println("입력이 실패하였습니다.");
		}
	}
	
	public void login() {
		System.out.println("학번을 입력하세요.");
		String id = sc.nextLine();
		System.out.println("패스워드를 입력하세요.");
		String pw = sc.nextLine();
		String name = student.isLoginCheck(id, pw);
		if(name == null) {
			System.out.println("로그인 실패");
		} else {
			System.out.println(name + "님 환영합니다.");
		}
	}
	

	private void searchStudent(StudentDto dto) {
		System.out.print(dto.getStudent_id() + " ");
		System.out.print(dto.getStudent_name() + " ");
		System.out.print(dto.getStudent_dept() + " ");
		System.out.print(dto.getDept_name() + " ");
		System.out.println(dto.getStudent_birthday() + " ");
	}

	private void studentList(List<StudentDto> list) {
		for (StudentDto dto : list) {
			System.out.print(dto.getStudent_id() + " ");
			System.out.print(dto.getStudent_name() + " ");
			System.out.print(dto.getStudent_dept() + " ");
			System.out.print(dto.getDept_name() + " ");
			System.out.println(dto.getStudent_birthday() + " ");
		}
	}
}
