package com.company.hello.member;

public class MemberService {
	public MemberVo signUpConfirm(MemberVo memberVo) 
	{
		System.out.println("MemberService의 signUpConfirm() 메서드 호출됨");
		System.out.println("inserted id=" +
	               memberVo.getM_id() );
	      System.out.println("inserted 암호=" +
	               memberVo.getM_pw() ) ;
	      System.out.println("inserted 이름=" +
	               memberVo.getM_name() );
	      System.out.println("inserted 메일주소=" +
	               memberVo.getM_mail() );
	      System.out.println("inserted 전화번호=" +
	               memberVo.getM_phone() );
	      
		return memberVo;
	}
}
