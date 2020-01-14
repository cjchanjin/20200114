package co.cjpark.lms.student;

import java.sql.Date;

public class StudentDto {
	private String student_id;
	private String student_name;
	private String student_dept;
	private Date student_birthday;
	private String dept_name;
	
	public StudentDto() {

	}
	
	//Insert 구문에서 활용하기 위해
	public StudentDto(String id, String name, String dept, Date birth) {
		this.student_id = id;
		this.student_name = name;
		this.student_dept = dept;
		this.student_birthday = birth;
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_dept() {
		return student_dept;
	}

	public void setStudent_dept(String student_dept) {
		this.student_dept = student_dept;
	}

	public Date getStudent_birthday() {
		return student_birthday;
	}

	public void setStudent_birthday(Date student_birthday) {
		this.student_birthday = student_birthday;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	
}
