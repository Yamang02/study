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
        Response.Write"최대공약수는" & u
    else
        Response.Write"최대공약수는" & v
    end if
elseif u < 0 or v < 0 then
    Response.Write"0보다 큰 수를 입력해 주세요"
else  
    response.Write"최대공약수는" & get_gcd(u,v)

end if
    
%>