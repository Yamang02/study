<%
Set fs = Server.CreateObject("Scripting.FileSystemObject")
fs.CreateTextFile "c:\MyTest\test.txt",true
%>
<HTML>
<BODY>
<br><center><font face="돋움" size="2">
<h2>FSO 텍스트화일 만들기</h2>
<%
if fs.FileExists("c:\MyTest\test.txt") then
   Response.write "결과 : test.txt화일이 만들어 졌습니다."
else
   Response.write "결과 : test.txt화일이 만들어지지 못했습니다."
end if
%>
    
</font></center>
    <!--NT계정에 관한 글이 있는데 현 윈도우에서는 정상적으로 파일 생성이 됨(권한)-->
</BODY>
</HTML>