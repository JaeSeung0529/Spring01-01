<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="/member/memberTable" method="get">
      ID : <input type="text" name="id" ><br />  
      PW : <input type="password" name="pw" ><br />  
      NAME : <input type="text" name="name" ><br />  
      NUM1 : <input type="text" name="Num1" ><br />
      NUM2 : <input type="text" name="Num2" ><br />
      EMAIL : <input type="text" name="Email" ><br />  
      PHONE : <input type="text" name="phone"><br />  
      ADDRESS : <input type="text" name="address"><br />  
      JOB : <input type="text" name="job"><br />  
      <input type="submit" value="INSERT" >   
   </form>
</body>
</html>