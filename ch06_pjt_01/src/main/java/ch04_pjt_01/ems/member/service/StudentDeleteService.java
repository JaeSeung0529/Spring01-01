package ch04_pjt_01.ems.member.service;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDao;

public class StudentDeleteService {
	private StudentDao studentDao;
	public StudentDeleteService() {}
	public StudentDeleteService(StudentDao studentDao) 
	{
		this.studentDao = studentDao;
	
	}
	//아래에 메서드 추가
	public void delete(String sNum) 
	{
		if(verify(sNum)) {
			studentDao.delete(sNum);
		 }
		else
			System.out.println("해당 학생이 없어서 삭제 불가");
			
	}
	public Boolean verify(String sNum)
	{
		Student student = studentDao.select(sNum);
		return student != null ? true: false;
	}
}	
