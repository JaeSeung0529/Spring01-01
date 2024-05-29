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
	
	//홈 페이지 매핑
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String home(Locale locale, Model model) 
	   {
		System.out.println("MemberController의 home()메서드");
	      logger.info("Welcome home! The client locale is {}.", locale);
	      
	      //현재 날짜 및 시간 설정
	      Date date = new Date();
	      DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
	      
	      String formattedDate = dateFormat.format(date);
	      
	      //모델에 현재 시간 추가
	      model.addAttribute("serverTime", formattedDate );
	      
	      return "home";//home.jsp로 이동
	   }
	
	//회원가입 페이지 매핑
	@RequestMapping("/signup")
	public String signup() 
	{
		return "sign_up" ;//sign_up.jsp로 이동
	}
	
	//로그인 페이지 매핑
	@RequestMapping("/signin")
	public String signin() 
	{
		return "sign_in" ;//sign_in.jsp로 이동
	}
	
	
	
//	MemberService memberService = new MemberService();
	//회원가입 확인 매핑
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/signUpConfirm")
	public String signUpConfirm(MemberVo memberVo) {
		System.out.println("MemberController의 signUpConfirm() 메서드 호출됨");

		//회원 정보를 콘솔에 출력
		System.out.println("입력한 id=" + memberVo.getM_id());
		System.out.println("입력한 암호=" + memberVo.getM_pw());
		System.out.println("입력한 메일주소=" + memberVo.getM_mail());
		System.out.println("입력한 전화번호=" + memberVo.getM_phone());
		
		
		//회원 서비스를 통해 회원 가입 확인
		memberService.signUpConfirm(memberVo);
		return "result" ;//result.jsp로 이동
	}
	
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
	
	//로그인 확인 매핑
	@RequestMapping("/signInConfirm")
	public String signInConfirm(MemberVo memberVo) {
		System.out.println("MemberController의 signInConfirm() 메서드");
		System.out.println("전달된 id=" + memberVo.getM_id());
		System.out.println("전달된 pwd=" + memberVo.getM_pw());
		
		//회원 서비스를 통해 로그인 확인
		MemberVo signInedMember = memberService.signInConfirm(memberVo);
		
		
		//로그인 결과에 따라 적절한 페이지로 이동
		if(signInedMember != null) {
			return "signin_ok";//로그인 성공 시 sigin_ok.jsp로 이동
		}else {
			return "signin_ng";//로그인 실패 시 sigin_ng.jsp로 이동
		}
	}
	
}
