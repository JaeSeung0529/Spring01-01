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
	
	//회원 가입 확인
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
	      
	      //회원 등록 메서드 호출
	      memberDao.insertMember(memberVo);
	      
	    //성공적으로 회원 가입 확인을 했을 경우 0 반환
		return 0;
	}
	
	//로그인 확인
	public MemberVo signInConfirm(MemberVo memberVo) {
		System.out.println("MemberService의 signInConfirm()메서드");
		System.out.println("전송된 id=" + memberVo.getM_id());
		System.out.println("전송된 pw=" + memberVo.getM_pw());
		
		//회원 조회 메서드 호출
		MemberVo signInedMember = memberDao.selectMember(memberVo);
		
		//조회된 회원 반환
		return signInedMember;
	}
}
