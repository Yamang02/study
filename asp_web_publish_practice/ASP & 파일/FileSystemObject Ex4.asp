<%
Set fs = Server.CreateObject("Scripting.FileSystemObject")
Set objFile = fs.OpenTextFile("c:\MyTest\test.txt",8)
%>
<!--"1"�� �б�����(ForReading), "2"�� ��������(ForWriting)�̸�, "8"�� �а��� ����(ForAppending)���-->
<!--�� ��° ���ڴ� ������ �� �� ������ ������ �������� ���� ��� ���Ӱ� ������ ������̳�? �ƴϳ�?�� �����ϴ� �����Դϴ�. ���� ������ ���� ��� ���ο� ������ ����鼭 Open�ϱ⸦ ���Ѵٸ� true�� �־�� �ϸ� �׷��� �ʰ� �ݵ�� ������ �־�߸� �Ѵٸ� false-->
<!-- ������ ������ ��Ȯ�� ��µ��� �ʴ´� -->

<html>
<body>
    <br>
    <center>
        <font face="����" size="2">
            <h2>FSO �ؽ�Ʈȭ�Ͽ� ����</h2>
            <%
objFile.writeLine("�̰��� �۾��� �׽�Ʈ�Դϴ�.")
objFile.writeLine("�� ���� �ι�° ���ο� �������ϴ�.")
objFile.writeLine("�� ���� ����° ���ο� �������ϴ�.")
objFile.close
            %>
�۾��� �Ϸ�!!
        </font>
    </center>
</body>
</html>
