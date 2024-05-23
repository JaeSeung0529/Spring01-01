<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result.jsp file</title>
</head>
<body>
	<h1>회원정보</h1>

	<table border="1" bordercolor="black">
		<tr>
			<td>ID</td>
			<td>PASSWD</td>
			<td>NAME</td>
			<td>NUM1</td>
			<td>NUM2</td>
			<td>EMAIL</td>
			<td>PHONE</td>
			<td>ZIPCODE/ADDRESS</td>
			<td>JOB</td>
		</tr>
		<tr>
			<td>${memberVo.m_id}</td>
			<td>${memberVo.m_pw}</td>
			<td>${memberVo.m_name}</td>
			<td>${memberVo.m_num1}</td>
			<td>${memberVo.m_num2}</td>
			<td>${memberVo.m_mail}</td>
			<td>${memberVo.m_phone}</td>
			<td>${memberVo.m_address}</td>
			<td>${memberVo.m_job}</td>
		</tr>
		<tr>
            <td>${newMemberVo.m_id}</td>
            <td>${newMemberVo.m_pw}</td>
            <td>${newMemberVo.m_name}</td>
            <td>${newMemberVo.m_num1}</td>
            <td>${newMemberVo.m_num2}</td>
            <td>${newMemberVo.m_mail}</td>
            <td>${newMemberVo.m_phone}</td>
            <td>${newMemberVo.m_address}</td>
            <td>${newMemberVo.m_job}</td>
        </tr>	
	</table>
	<button type="button" onclick="location.href='/member/signup'">정보입력하기</button>
</body>
</html>