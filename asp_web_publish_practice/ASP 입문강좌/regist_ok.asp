<%
DIM strName, strEmail, strPhone
 
strName = Request.Form("txtName")
strEmail = Request.Form("txtEmail")
strPhone = Request.Form("txtPhone")
 
Response.Write "이름은 = " & strName & "<BR>"
Response.Write "Email은 = " & strEmail & "<BR>"
Response.Write "전화번호는 = " & strPhone & "<BR>"
%>