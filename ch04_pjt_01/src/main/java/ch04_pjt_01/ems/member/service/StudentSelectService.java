package ch04_pjt_01.ems.member.service;

import ch04_pjt_01.ems.member.dao.StudentDao;

public class StudentSelectService {
	private StudentDao studentDao;
	public StudentSelectService() {}
	public StudentSelectService(StudentDao studentDao)
	{
		this.studentDao = studentDao;
	}
	//아래에 메서드 추가
}
