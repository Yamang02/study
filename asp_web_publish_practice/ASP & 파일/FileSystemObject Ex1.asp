<%
Set fs = Server.CreateObject("Scripting.FileSystemObject")
Set Cdrive = fs.GetDrive("c:")
%>

<html>
<body>
    <br>
    <center>
        <font face="돋움" size="2">
            <h2>FileSystemObject Ex1</h2>
            <br>
            C드라이브의 남은 공간 : <%=Cdrive.freespace %> bytes
            <br>
            <br>
        </font>
        <table cellspacing="1" cellpadding="5" bgcolor="slategray">
            <tbody>
                <tr bgcolor="#eeeeee">
                    <td colspan="2"><b>Drive 개체의 속성</b></td>
                </tr>
                <tr bgcolor="white">
                    <td>AvailableSpace</td>
                    <td>지정한 드라이브나 네트워크 공유에서 사용할 수 있는 디스크 공간의 크기를 반환</td>
                </tr>
                <tr bgcolor="white">
                    <td>DriveLetter</td>
                    <td>실제의 로컬 드라이브나 네트워크 공유의 드라이브 문자를 반환</td>
                </tr>
                <tr bgcolor="white">
                    <td>FileSystem</td>
                    <td>드라이브에서 사용하는 파일 시스템의 형식을 반환(FAT, NTFS 및 CDFS)</td>
                </tr>
                <tr bgcolor="white">
                    <td>FreeSpace</td>
                    <td>지정한 드라이브나 네트워크 공유에서 사용할 수 있는 빈 공간 크기를 반환</td>
                </tr>
                <tr bgcolor="white">
                    <td>IsReady</td>
                    <td>지정한 드라이브가 준비되었으면 True를, 그렇지 않으면 False를 반환</td>
                </tr>
                <tr bgcolor="white">
                    <td>Path</td>
                    <td>지정한 파일, 폴더 또는 드라이브의 경로를 반환</td>
                </tr>
                <tr bgcolor="white">
                    <td>RootFolder</td>
                    <td>지정한 드라이브의 루트 폴더를 나타내는 Folder 개체를 반환</td>
                </tr>
                <tr bgcolor="white">
                    <td>SerialNumber</td>
                    <td>디스크 볼륨을 고유하게 식별하는 데 사용하는 십진 일련 번호를 반환</td>
                </tr>
                <tr bgcolor="white">
                    <td>ShareName</td>
                    <td>지정한 드라이브의 네트워크 공유 이름을 반환</td>
                </tr>
                <tr bgcolor="white">
                    <td>TotalSize</td>
                    <td>드라이브나 네트워크 공유의 전체 공간을 바이트 단위로 반환</td>
                </tr>
                <tr bgcolor="white">
                    <td>VolumeName</td>
                    <td>지정한 드라이브의 볼륨 이름을 지정하거나 반환</td>
                </tr>
            </tbody>
        </table>


    </center>
</body>
</html>
