<%
Set fs = Server.CreateObject("Scripting.FileSystemObject")
fs.CreateTextFile "c:\MyTest\test.txt",true
%>
<HTML>
<BODY>
<br><center><font face="����" size="2">
<h2>FSO �ؽ�Ʈȭ�� �����</h2>
<%
if fs.FileExists("c:\MyTest\test.txt") then
   Response.write "��� : test.txtȭ���� ����� �����ϴ�."
else
   Response.write "��� : test.txtȭ���� ��������� ���߽��ϴ�."
end if
%>
    
</font></center>
    <!--NT������ ���� ���� �ִµ� �� �����쿡���� ���������� ���� ������ ��(����)-->
</BODY>
</HTML>