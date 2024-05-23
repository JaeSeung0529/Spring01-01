package com.company.hello.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


//@Component
//@Service
@Repository
public class MemberService {
	
	@Autowired
	MemberDao memberDao;
	
	public int signUpConfirm(MemberVo memberVo) 
	{
		System.out.println("MemberService의 signUpConfirm() 메서드 호출됨");
		System.out.println("inserted id=" +
	               memberVo.getM_id() );
	      System.out.println("inserted 암호=" +
	               memberVo.getM_pw() ) ;
	      System.out.println("inserted 메일주소=" +
	               memberVo.getM_mail() );
	      System.out.println("inserted 전화번호=" +
	               memberVo.getM_phone() );
	      
	      memberDao.insertMember(memberVo);
	      
		return 0;
	}
	
	public MemberVo signInConfirm(MemberVo memberVo) {
		System.out.println("MemberService의 signInConfirm()메서드");
		System.out.println("전송된 id=" + memberVo.getM_id());
		System.out.println("전송된 pw=" + memberVo.getM_pw());
		
		MemberVo signInedMember = memberDao.selectMember(memberVo);
		
		return signInedMember;
	}
}
