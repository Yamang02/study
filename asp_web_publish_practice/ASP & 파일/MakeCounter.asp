<%@  language="VBScript" %>
<html>
<head>
    <meta name="GENERATOR" content="Microsoft Visual Studio 6.0">
</head>
<body>
    <basefont size="2">
        <%
Count = application("visit")
visitCount = ""
for i = 1 to len(Count)
   select case Mid(Count,i,1)
      case "1"
         visitCount = visitCount & "<img src=images/1.gif align=absmiddle>"
      case "2"
         visitCount = visitCount & "<img src=images/2.gif align=absmiddle>"
      case "3"
         visitCount = visitCount & "<img src=images/3.gif align=absmiddle>"
      case "4"
         visitCount = visitCount & "<img src=images/4.gif align=absmiddle>"
      case "5"
         visitCount = visitCount & "<img src=images/5.gif align=absmiddle>"
      case "6"
         visitCount = visitCount & "<img src=images/6.gif align=absmiddle>"
      case "7"
         visitCount = visitCount & "<img src=images/7.gif align=absmiddle>"
      case "8"
         visitCount = visitCount & "<img src=images/8.gif align=absmiddle>"
      case "9"
         visitCount = visitCount & "<img src=images/9.gif align=absmiddle>"
      case "0"
         visitCount = visitCount & "<img src=images/0.gif align=absmiddle>"
   End select
Next
        %>       
현재 전체 카운트 : <%=visitCount%>
</body>
</html>
