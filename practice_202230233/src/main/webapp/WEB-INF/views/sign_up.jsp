<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sign_up.jsp 파일</title>
</head>
<body>
<h1>sign up.jsp 파일</h1>
   <form action="/member/signUpConfirm" method="get">
      ID : <input type="text" name="m_id" ><br />  
      PASSWD : <input type="password" name="m_pw" ><br /> 
      NAME : <input type="text" name="m_name"><br/>
      NUM1 : <input type="text" name="m_num1"><br/>
      NUM2 : <input type="text" name="m_num2"><br/> 
      EMAIL : <input type="text" name="m_mail" ><br />  
      PHONE : <input type="text" name="m_phone"><br /> 
      ZIPCODE/ADDRESS : <input type="text" name="m_address"><br/>
      JOB : <input type="text" name="m_job"><br/> 
      <input type="submit" value="SIGN UP" >  
  
   </form>

</body>
</html>