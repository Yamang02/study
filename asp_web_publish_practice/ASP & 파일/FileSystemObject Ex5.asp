<%
Set fs = Server.CreateObject("Scripting.FileSystemObject")
Set objFile = fs.OpenTextFile("c:\MyTest\test.txt",1)
%>
<html>
<body>
    <br>
    <center>
        <font face="돋움" size="2">
            <h2>FSO 텍스트화일 읽기</h2>
            <%
Do While objFile.AtEndOfStream <> True
    Response.write objFile.readLine & "<br>"
loop
' 이런 방법도 같은 결과를 출력한다.(ReadAll 사용)
' content = objFile.readall
' str = replace(content,chr(13)&chr(10),"<br>")
' Response.write str
            %>
        </font>

        <table cellspacing="1" bgcolor="slategray" cellpadding="3" width="550" border="0">
            <tbody>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">속성</td>
                    <td style="padding-left: 20px">설명</td>
                </tr>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">write(문자열)</td>
                    <td style="padding-left: 20px">파일에 문자열을 입력</td>
                </tr>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">WriteLine(문자열)</td>
                    <td style="padding-left: 20px">파일에 문자열과 엔터값(라인문자)을 입력</td>
                </tr>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">WriteBlankLines(i)</td>
                    <td style="padding-left: 20px">파일에 i 개의 엔터값(라인문자)을 입력</td>
                </tr>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">Read(i)</td>
                    <td style="padding-left: 20px">파일에서 i 개의 문자만을 읽어온다</td>
                </tr>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">ReadLine</td>
                    <td style="padding-left: 20px">파일에서 한 라인을 읽어온다</td>
                </tr>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">ReadAll</td>
                    <td style="padding-left: 20px">파일에서 모든 텍스트를 읽어온다</td>
                </tr>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">Skip(i)</td>
                    <td style="padding-left: 20px">파일에서 i 개 만큼 문자를 건너뛴다</td>
                </tr>
                <tr bgcolor="white">
                    <td style="padding-left: 20px">SkipLine</td>
                    <td style="padding-left: 20px">파일에서 읽어올 때 라인하나를 건너뛴다</td>
                </tr>
            </tbody>
        </table>
    </center>
</body>
</html>
