package co.cjpark.lms.dept;

import java.util.List;

public interface DeptService {
	public List<DeptDto> allSelect ();
	public DeptDto select (DeptDto dto);
	public int insert (DeptDto dto);
	public int update (DeptDto dto);
	public int delete (DeptDto dto);
}
