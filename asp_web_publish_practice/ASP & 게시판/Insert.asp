<!--METADATA TYPE="typelib" NAME="ADODB Type Library"
FILE="C:\Program Files\Common Files\SYSTEM\ADO\msado15.dll" -->
<%
Option Explicit

Dim name, mail, title, url, memo, pwd
name = Request.form("name")
mail = Request.form("mail")
title = Request.form("title")
url = Request.form("url")
memo = Request.form("memo")
pwd = Request.form("pwd")

Dim strConnect
strConnect="Provider=Microsoft.ACE.OLEDB.16.0;Data Source=C:\Users\dit223501\Desktop\git\study\asp_web_publish_practice\ASP & 게시판\MyDataBase.mdb;Persist Security Info=False"

Dim adoRs
Set adoRs = Server.CreateObject("ADODB.RecordSet")
adoRs.Open "MyBoard", strConnect, adOpenStatic, adLockPessimistic, adCmdTable

Dim cols, vals
cols=Array("b_name","b_email","b_title","b_url","b_pwd","b_readnum","b_date","b_ipaddr","b_content")
vals=Array(name, mail, title, url, pwd, 0, now(), Request.ServerVariables("REMOTE_ADDR"), memo)

with adoRs
  .AddNew cols, vals

  .Update
  .Close
end with

Set adoRs = nothing
%>