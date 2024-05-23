package com.company.hello.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class MemberDao {
	Map<String, MemberVo> memberDB = 
			new HashMap<String, MemberVo>();
	
	public MemberVo selectMember(MemberVo memberVo) {
		System.out.println("[MemberDao] selectMember() 메서드");
		System.out.println("전송된 id=" + memberVo.getM_id());
		System.out.println("전송된 pw=" + memberVo.getM_pw());
		
		MemberVo signInedMember = memberDB.get(memberVo.getM_id());
		
		if(signInedMember != null && memberVo.getM_pw().equals(signInedMember)) {
		return signInedMember;
		}else {
		return null;
		}
	}
	
	public void insertMember(MemberVo memberVo) {
		System.out.println("[MemberDao] insertMember()");
		System.out.println("전달된 ID=" + memberVo.getM_id());
		System.out.println("전달된 pwd=" + memberVo.getM_pw());
		System.out.println("전달된 email=" + memberVo.getM_mail());
		System.out.println("전달된 phone="+ memberVo.getM_phone());
		
		memberDB.put(memberVo.getM_id(), memberVo);
		printAllMember();
	}
	
	public void printAllMember() {
		System.out.println("[MemberDao]의 printAllMember()");
	      
	      Set<String> keys = memberDB.keySet();  
	         Iterator<String> iterator = keys.iterator();  
	                
	         while (iterator.hasNext()) {  
	              String key = iterator.next();  
	              MemberVo memberVo = memberDB.get(key);  
	             
	              System.out.println("m_id: " + memberVo.getM_id());
	             System.out.println("m_pw: " + memberVo.getM_pw());
	             System.out.println("m_mail: " + memberVo.getM_mail());
	             System.out.println("m_phone: " + memberVo.getM_phone());            
	           }
	}


}
