<%
Set fs = Server.CreateObject("Scripting.FileSystemObject")
Set myfile = fs.GetFile("c:\주석 2023-07-03 164811.png")
%>

<html>
<body>
    <br>
    <center>
        <font face="돋움" size="2">
            <h2>FileSystemObject 예제2</h2>
            파일의 정보<p>
                file size : <%=myfile.size%> bytes<br>
                file type : <%=myfile.type%><br>
                file path : <%=myfile.path%>
        </font>

        <table cellspacing="1" cellpadding="5" bgcolor="slategray">
            <tbody>
                <tr bgcolor="#eeeeee">
                    <td colspan="2"><b>File 개체의 속성</b></td>
                </tr>
                <tr bgcolor="white">
                    <td>
                        <p align="center">Size</p>
                    </td>
                    <td>파일의 사이즈를 얻어옵니다.</td>
                </tr>
                <tr bgcolor="white">
                    <td>
                        <p align="center">Type</p>
                    </td>
                    <td>파일의 타입을 얻어옵니다.</td>
                </tr>
                <tr bgcolor="white">
                    <td align="middle">Path</td>
                    <td>파일의 경로를 반환함다</td>
                </tr>
                <tr bgcolor="white">
                    <td align="middle">ShortName</td>
                    <td>파일의 이름를 8.3규칙으로 반환함다</td>
                </tr>
                <tr bgcolor="white">
                    <td align="middle">ShortPath</td>
                    <td>파일의 경로을 8.3규칙으로 반환함다</td>
                </tr>
                <tr bgcolor="white">
                    <td align="middle">ParentFolder</td>
                    <td>파일의 상위 폴더를 얻어옵니다.</td>
                </tr>
                <tr bgcolor="white">
                    <td align="middle">Name</td>
                    <td>파일의 이름을 얻어옵니다</td>
                </tr>
                <tr bgcolor="white">
                    <td align="middle">Drive</td>
                    <td>파일이 위치하는 드라이브명을 얻어옵니다</td>
                </tr>
                <tr bgcolor="white">
                    <td align="middle">DateCreated</td>
                    <td>파일이 만들어진 날짜와 시간을 얻어옵니다</td>
                </tr>
                <tr bgcolor="white">
                    <td>DateLastAccessed</td>
                    <td>파일이 마지막으로 억세스된 날짜,시간을 반환</td>
                </tr>
                <tr bgcolor="white">
                    <td>DateLastModified</td>
                    <td>파일이 마지막으로 수정된 날짜,시간을 반환</td>
                </tr>
            </tbody>
        </table>
    </center>
</body>
</html>
