<HTML>
	<BODY>
		<TABLE>
    <% For Each key in Request.ServerVariables %>
			<TR>
				<TD><%=key %>
				</TD>
				<TD>
            <%
                if Request.ServerVariables(key) = "" Then
                    Response.Write " "
                else
                    Response.Write Request.ServerVariables(key)
                end if
            %>
				</TD>
			</TR>
    <% Next %>
		</TABLE>
	</BODY>
</HTML>