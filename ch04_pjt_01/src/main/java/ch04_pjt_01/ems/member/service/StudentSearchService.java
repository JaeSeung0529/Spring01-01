package ch04_pjt_01.ems.member.service;


import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDao;

public class StudentSearchService {
	private StudentDao studentDao;
	public StudentSearchService() {}
	public StudentSearchService(StudentDao studentDao) 
	{
		this.studentDao = studentDao;
	}
	
	public Student search(String sId) {
		if (verify(sId)) {
			return studentDao.search(sId);
		} else {
			System.out.println("검색된 학생이 없음.");
			return null;
		}
	}

	public boolean verify(String sId) {
		Student student = studentDao.search(sId);
		return student != null ? true : false;
	}
}
