<%

public Function get_gcd(u, v)
    dim temp 
    do until(u=0)
        if u < v then
            temp = u
            u = v
            v = temp
        end if

    u = u - v
    loop

    get_gcd = v
end Function

dim u,v
u = Request.Form("NUM1")
v = Request.Form("NUM2")

if u = 0 or v = 0 then
    if u > v then
        Response.Write"�ִ�������" & u
    else
        Response.Write"�ִ�������" & v
    end if
elseif u < 0 or v < 0 then
    Response.Write"0���� ū ���� �Է��� �ּ���"
else  
    response.Write"�ִ�������" & get_gcd(u,v)

end if
    
%>