<HTML>
	<HEAD>
		<META charset="UTF-8">
			<TITLE>
Welcome To Yamang93.net
</TITLE>
		</HEAD>
		<BODY>
			<CENTER>
			<%IF Hour(Now) < 12 THEN %>
			지금은 오전입니다.
			<% ELSE %>
			지금은 오후입니다.
			<% END IF %>
			</CENTER>
		</BODY>
	</HTML>