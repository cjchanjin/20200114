package co.cjpark.lms.student;

import java.util.List;

public interface StudentService {
	public List <StudentDto> allStudent();
	public StudentDto select(StudentDto dto);
	public int insert (StudentDto dto);
	public int update (StudentDto dto);
	public int delete (StudentDto dto);
}
