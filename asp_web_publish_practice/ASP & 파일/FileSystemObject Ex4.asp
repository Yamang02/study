<%
Set fs = Server.CreateObject("Scripting.FileSystemObject")
Set objFile = fs.OpenTextFile("c:\MyTest\test.txt",8)
%>
<!--"1"은 읽기전용(ForReading), "2"는 쓰기전용(ForWriting)이며, "8"은 읽고쓰기 가능(ForAppending)모드-->
<!--세 번째 인자는 파일을 열 때 지정된 파일이 존재하지 않을 경우 새롭게 파일을 만들것이냐? 아니냐?를 구분하는 인자입니다. 만일 파일이 없을 경우 새로운 파일을 만들면서 Open하기를 원한다면 true를 주어야 하며 그렇지 않고 반드시 파일이 있어야만 한다면 false-->
<!-- 에러의 내용은 정확히 출력되지 않는다 -->

<html>
<body>
    <br>
    <center>
        <font face="돋움" size="2">
            <h2>FSO 텍스트화일에 쓰기</h2>
            <%
objFile.writeLine("이것은 글쓰기 테스트입니다.")
objFile.writeLine("이 글은 두번째 라인에 쓰여집니다.")
objFile.writeLine("이 글은 세번째 라인에 쓰여집니다.")
objFile.close
            %>
글쓰기 완료!!
        </font>
    </center>
</body>
</html>
