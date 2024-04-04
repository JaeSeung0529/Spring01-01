package ch04_pjt_01.ems.member.dao;

import java.util.HashMap;
import java.util.Map;

import ch04_pjt_01.ems.member.Student;

public class StudentDao {
	private Map<String, Student> studentDB = new HashMap<String, Student>();
		
	public StudentDao() {
		System.out.println("StudentDao기본생성자 호출됨");
	}
	
	public void insert(Student student) {
	      studentDB.put(student.getsNum(), student);
	      studentDB.put(student.getsId(), student);
	   }

	   public Student select(String sNum) {
	      return studentDB.get(sNum);
	   }
	   public Student search(String sId) {
		  return studentDB.get(sId);
	   }
	   

	   public void update(Student student) {
	      studentDB.put(student.getsNum(), student);
	   }

	   public void delete(String sNum) {
	      studentDB.remove(sNum);
	   }

	   public Map<String, Student> getStudentDB() {
	      return studentDB;
	   }
	   
}
