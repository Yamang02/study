<%
Set fs = Server.CreateObject("Scripting.FileSystemObject")
Set Cdrive = fs.GetDrive("c:")
%>

<html>
<body>
    <br>
    <center>
        <font face="����" size="2">
            <h2>FileSystemObject Ex1</h2>
            <br>
            C����̺��� ���� ���� : <%=Cdrive.freespace %> bytes
            <br>
            <br>
        </font>
        <table cellspacing="1" cellpadding="5" bgcolor="slategray">
            <tbody>
                <tr bgcolor="#eeeeee">
                    <td colspan="2"><b>Drive ��ü�� �Ӽ�</b></td>
                </tr>
                <tr bgcolor="white">
                    <td>AvailableSpace</td>
                    <td>������ ����̺곪 ��Ʈ��ũ �������� ����� �� �ִ� ��ũ ������ ũ�⸦ ��ȯ</td>
                </tr>
                <tr bgcolor="white">
                    <td>DriveLetter</td>
                    <td>������ ���� ����̺곪 ��Ʈ��ũ ������ ����̺� ���ڸ� ��ȯ</td>
                </tr>
                <tr bgcolor="white">
                    <td>FileSystem</td>
                    <td>����̺꿡�� ����ϴ� ���� �ý����� ������ ��ȯ(FAT, NTFS �� CDFS)</td>
                </tr>
                <tr bgcolor="white">
                    <td>FreeSpace</td>
                    <td>������ ����̺곪 ��Ʈ��ũ �������� ����� �� �ִ� �� ���� ũ�⸦ ��ȯ</td>
                </tr>
                <tr bgcolor="white">
                    <td>IsReady</td>
                    <td>������ ����̺갡 �غ�Ǿ����� True��, �׷��� ������ False�� ��ȯ</td>
                </tr>
                <tr bgcolor="white">
                    <td>Path</td>
                    <td>������ ����, ���� �Ǵ� ����̺��� ��θ� ��ȯ</td>
                </tr>
                <tr bgcolor="white">
                    <td>RootFolder</td>
                    <td>������ ����̺��� ��Ʈ ������ ��Ÿ���� Folder ��ü�� ��ȯ</td>
                </tr>
                <tr bgcolor="white">
                    <td>SerialNumber</td>
                    <td>��ũ ������ �����ϰ� �ĺ��ϴ� �� ����ϴ� ���� �Ϸ� ��ȣ�� ��ȯ</td>
                </tr>
                <tr bgcolor="white">
                    <td>ShareName</td>
                    <td>������ ����̺��� ��Ʈ��ũ ���� �̸��� ��ȯ</td>
                </tr>
                <tr bgcolor="white">
                    <td>TotalSize</td>
                    <td>����̺곪 ��Ʈ��ũ ������ ��ü ������ ����Ʈ ������ ��ȯ</td>
                </tr>
                <tr bgcolor="white">
                    <td>VolumeName</td>
                    <td>������ ����̺��� ���� �̸��� �����ϰų� ��ȯ</td>
                </tr>
            </tbody>
        </table>


    </center>
</body>
</html>
