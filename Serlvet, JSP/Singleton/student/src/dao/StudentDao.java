package dao;

import java.util.ArrayList;
import java.util.List;

import dto.StudentDto;

// DAO Data Access Object = CRUD
public class StudentDao {

	private static StudentDao dao = null;
	
	public List<StudentDto> list = null;
	
	private StudentDao() {
		list = new ArrayList<StudentDto>();
	}
	
	public static StudentDao getInstance() {
		if(dao == null) {
			dao = new StudentDao();
		}
		return dao;
	}
	
}
