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
      PW : <input type="password" name="m_pw" ><br />  
      MAIL : <input type="text" name="m_mail" ><br />  
      PHONE : <input type="text" name="m_phone"><br />  
      AGE : <input type="text" name="m_age"><br />
      DATE : <input type="text" name="m_date" id="m_date" readonly><br />
      <input type="submit" value="SIGN UP" >  
      <input type="reset" value="CANCEL" >  
   </form>
<script>
      document.addEventListener("DOMContentLoaded", function() {
         var today = new Date();
         var date = today.getFullYear() + '-' + 
                    ('0' + (today.getMonth() + 1)).slice(-2) + '-' + 
                    ('0' + today.getDate()).slice(-2);
         document.getElementById('m_date').value = date;
      });
   </script>
</body>
</html>