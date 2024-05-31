package com.company.hello.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class MemberDao {
	//회원 데이터베이스 맵
	Map<String, MemberVo> memberDB = 
			new HashMap<String, MemberVo>();
	
	//회원 조회
	public MemberVo selectMember(MemberVo memberVo) {
		System.out.println("[MemberDao] selectMember() 메서드");
		System.out.println("전송된 id=" + memberVo.getM_id());
		System.out.println("전송된 pw=" + memberVo.getM_pw());
		
		//맵에서 회원을 조회하여 반환
		MemberVo signInedMember = memberDB.get(memberVo.getM_id());
		
		//회원이 존재하고 비밀번호가 일치하면 회원 정보를 반환
		if (signInedMember != null && memberVo.getM_pw().equals(signInedMember.getM_pw())) {
		    return signInedMember;
		} else {
		    return null;
		}
	}
	
	
	//회원 등록
	public void insertMember(MemberVo memberVo) {
		System.out.println("[MemberDao] insertMember()");
		System.out.println("전달된 ID=" + memberVo.getM_id());
		System.out.println("전달된 pwd=" + memberVo.getM_pw());
		System.out.println("전달된 email=" + memberVo.getM_mail());
		System.out.println("전달된 phone="+ memberVo.getM_phone());
		System.out.println("전달된 age="+ memberVo.getM_age());
		System.out.println("전달된 date="+ memberVo.getM_date());
		
		//회원을 맵에 추가
		memberDB.put(memberVo.getM_id(), memberVo);
		//현재 등록된 모든 회원 출력
		printAllMember();
	}
	
	//모든 회원 출력
	public void printAllMember() {
		System.out.println("[MemberDao]의 printAllMember()");
	      
		//모든 회원을 순회하며 출력
	      Set<String> keys = memberDB.keySet();  
	         Iterator<String> iterator = keys.iterator();  
	                
	         while (iterator.hasNext()) {  
	              String key = iterator.next();  
	              MemberVo memberVo = memberDB.get(key);  
	             
	              System.out.println("m_id: " + memberVo.getM_id());
	             System.out.println("m_pw: " + memberVo.getM_pw());
	             System.out.println("m_mail: " + memberVo.getM_mail());
	             System.out.println("m_phone: " + memberVo.getM_phone());  
	             System.out.println("m_age="+ memberVo.getM_age());
	             System.out.println("m_date="+ memberVo.getM_date());
	             
	           }
	}


}
