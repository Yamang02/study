<%
Set fs = Server.CreateObject("Scripting.FileSystemObject")
Set objFile = fs.OpenTextFile("c:\MyTest\test.txt",1)
%>
<html>
<body>
    <br>
    <center>
        <font face="����" size="2">
            <h2>FSO �ؽ�Ʈȭ�� �б�</h2>
            <%
Do While objFile.AtEndOfStream <> True
    Response.write objFile.readLine & "<br>"
loop
' �̷� ����� ���� ����� ����Ѵ�.(ReadAll ���)
' content = objFile.readall
' str = replace(content,chr(13)&chr(10),"<br>")
' Response.write str
            %>
        </font>

        <table cellspacing="1" bgcolor="slategray" cellpadding="3" width="550" border="0">
            <tbody>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">�Ӽ�</td>
                    <td style="padding-left: 20px">����</td>
                </tr>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">write(���ڿ�)</td>
                    <td style="padding-left: 20px">���Ͽ� ���ڿ��� �Է�</td>
                </tr>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">WriteLine(���ڿ�)</td>
                    <td style="padding-left: 20px">���Ͽ� ���ڿ��� ���Ͱ�(���ι���)�� �Է�</td>
                </tr>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">WriteBlankLines(i)</td>
                    <td style="padding-left: 20px">���Ͽ� i ���� ���Ͱ�(���ι���)�� �Է�</td>
                </tr>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">Read(i)</td>
                    <td style="padding-left: 20px">���Ͽ��� i ���� ���ڸ��� �о�´�</td>
                </tr>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">ReadLine</td>
                    <td style="padding-left: 20px">���Ͽ��� �� ������ �о�´�</td>
                </tr>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">ReadAll</td>
                    <td style="padding-left: 20px">���Ͽ��� ��� �ؽ�Ʈ�� �о�´�</td>
                </tr>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">Skip(i)</td>
                    <td style="padding-left: 20px">���Ͽ��� i �� ��ŭ ���ڸ� �ǳʶڴ�</td>
                </tr>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">SkipLine</td>
                    <td style="padding-left: 20px">���Ͽ��� �о�� �� �����ϳ��� �ǳʶڴ�</td>
                </tr>
            </tbody>
        </table>
    </center>
</body>
</html>
