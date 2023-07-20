Application_1.asp
<% Application("variant") = 1 %>
<HTML>
	<HEAD>
		<title>Application 변수 테스트</title>
	</HEAD>
	<BODY>
		<p>현재 Application("variant") 값은 <%=Application("variant")%> 입니다.</p>
		<P>그리고, 지금 바로 이 값을 +1 합니다</P>
<% Application("variant") = Application("variant") + 1 %>
	</BODY>
</HTML>