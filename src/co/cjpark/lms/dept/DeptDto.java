package co.cjpark.lms.dept;

public class DeptDto {
	private String dept_code;
	private String dept_name;
	
	public DeptDto() {

	}
	
	public DeptDto(String code, String name) {
		this.dept_code = code;
		this.dept_name = name;
	}

	public String getDept_code() {
		return dept_code;
	}

	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	
}
