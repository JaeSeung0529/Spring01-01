package com.company.hello.member;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	private static final Logger logger = 
			LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String home(Locale locale, Model model) 
	   {
		System.out.println("MemberController의 home()메서드");
	      logger.info("Welcome home! The client locale is {}.", locale);
	      
	      Date date = new Date();
	      DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
	      
	      String formattedDate = dateFormat.format(date);
	      
	      model.addAttribute("serverTime", formattedDate );
	      
	      return "home";
	   }
//	@RequestMapping("/signup")
//	public String signup() 
//	{
//		return "sign_up" ;
//	}
//	
//	@RequestMapping("/signin")
//	public String signin() 
//	{
//		return "sign_in" ;
//	}
//	
////	MemberService memberService = new MemberService();
//	@Autowired
//	MemberTableService memberService;
//	
//	@RequestMapping("/signUpConfirm")
//	public String signUpConfirm(MemberVo memberVo) {
//		System.out.println("MemberController의 signUpConfirm() 메서드 호출됨");
//
//		System.out.println("입력한 id=" + memberVo.getM_id());
//		System.out.println("입력한 암호=" + memberVo.getM_pw());
//		System.out.println("입력한 메일주소=" + memberVo.getM_mail());
//		System.out.println("입력한 전화번호=" + memberVo.getM_phone());
//		
//		memberService.signUpConfirm(memberVo);
//		return "result" ;
//	}
//	
//	@RequestMapping("/signUpConfirm")
//	public String signUpConfirm(@RequestParam String m_id,
//								@RequestParam String m_pw,
//								@RequestParam String m_mail,
//								@RequestParam String m_phone) {
//		System.out.println("signUpConfirm() 메서드 호출됨");
//
//		System.out.println("입력한 id=" + m_id);
//		System.out.println("입력한 암호=" + m_pw);
//		System.out.println("입력한 메일주소=" + m_mail);
//		System.out.println("입력한 전화번호=" + m_phone);
//		return "result" ;
//	}
	@Autowired
	MemberTableService memberService;
	
	@RequestMapping("/memberTable")
	public String memberTable(membertable membertable) {
		System.out.println("MemberController의 memberTable() 메서드 호출됨");

		System.out.println("입력한 id=" + membertable.getId());
		System.out.println("입력한 암호=" + membertable.getPw());
		System.out.println("입력한 이름=" + membertable.getName());
		System.out.println("입력한 Num1=" + membertable.getNum1());
		System.out.println("입력한 Num2=" + membertable.getNum2());
		System.out.println("입력한 메일주소=" + membertable.getEmail());
		System.out.println("입력한 전화번호=" + membertable.getPhone());
		System.out.println("입력한 집 주소=" + membertable.getAddress());
		System.out.println("입력한 직업=" + membertable.getJob());
		
		return "table";
	}
	@RequestMapping("/memberINSERT")
	public String memberInster() {
		return "tableinsert";
	}
}
