<%
Set fs = Server.CreateObject("Scripting.FileSystemObject")
Set myfile = fs.GetFile("c:\�ּ� 2023-07-03 164811.png")
%>

<html>
<body>
    <br>
    <center>
        <font face="����" size="2">
            <h2>FileSystemObject ����2</h2>
            ������ ����<p>
                file size : <%=myfile.size%> bytes<br>
                file type : <%=myfile.type%><br>
                file path : <%=myfile.path%>
        </font>

        <table cellspacing="1" cellpadding="5" bgcolor="slategray">
            <tbody>
                <tr bgcolor="#eeeeee">
                    <td colspan="2"><b>File ��ü�� �Ӽ�</b></td>
                </tr>
                <tr bgcolor="white">
                    <td>
                        <p align="center">Size</p>
                    </td>
                    <td>������ ����� ���ɴϴ�.</td>
                </tr>
                <tr bgcolor="white">
                    <td>
                        <p align="center">Type</p>
                    </td>
                    <td>������ Ÿ���� ���ɴϴ�.</td>
                </tr>
                <tr bgcolor="white">
                    <td align="middle">Path</td>
                    <td>������ ��θ� ��ȯ�Դ�</td>
                </tr>
                <tr bgcolor="white">
                    <td align="middle">ShortName</td>
                    <td>������ �̸��� 8.3��Ģ���� ��ȯ�Դ�</td>
                </tr>
                <tr bgcolor="white">
                    <td align="middle">ShortPath</td>
                    <td>������ ����� 8.3��Ģ���� ��ȯ�Դ�</td>
                </tr>
                <tr bgcolor="white">
                    <td align="middle">ParentFolder</td>
                    <td>������ ���� ������ ���ɴϴ�.</td>
                </tr>
                <tr bgcolor="white">
                    <td align="middle">Name</td>
                    <td>������ �̸��� ���ɴϴ�</td>
                </tr>
                <tr bgcolor="white">
                    <td align="middle">Drive</td>
                    <td>������ ��ġ�ϴ� ����̺���� ���ɴϴ�</td>
                </tr>
                <tr bgcolor="white">
                    <td align="middle">DateCreated</td>
                    <td>������ ������� ��¥�� �ð��� ���ɴϴ�</td>
                </tr>
                <tr bgcolor="white">
                    <td>DateLastAccessed</td>
                    <td>������ ���������� �＼���� ��¥,�ð��� ��ȯ</td>
                </tr>
                <tr bgcolor="white">
                    <td>DateLastModified</td>
                    <td>������ ���������� ������ ��¥,�ð��� ��ȯ</td>
                </tr>
            </tbody>
        </table>
    </center>
</body>
</html>
