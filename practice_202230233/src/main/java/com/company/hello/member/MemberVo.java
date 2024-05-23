package com.company.hello.member;

public class MemberVo {
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_num1;
	private String m_num2;
	private String m_address;
	private String m_job;
	private String m_mail;
	private String m_phone;
	
	
	
	
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_num1() {
		return m_num1;
	}
	public void setM_num1(String m_num1) {
		this.m_num1 = m_num1;
	}
	public String getM_num2() {
		return m_num2;
	}
	public void setM_num2(String m_num2) {
		this.m_num2 = m_num2;
	}
	public String getM_address() {
		return m_address;
	}
	public void setM_address(String m_address) {
		this.m_address = m_address;
	}
	public String getM_job() {
		return m_job;
	}
	public void setM_job(String m_job) {
		this.m_job = m_job;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
		System.out.println("setM_id메서드 호출됨");
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
		System.out.println("setM_pw메서드 호출됨");
	}
	public String getM_mail() {
		return m_mail;
	}
	public void setM_mail(String m_mail) {
		this.m_mail = m_mail;
		System.out.println("setM_mail메서드 호출됨");
	}
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
		System.out.println("setM_phone메서드 호출됨");
	}
	
	
}
