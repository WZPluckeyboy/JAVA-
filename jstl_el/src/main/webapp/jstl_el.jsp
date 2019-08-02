<%@ page import="com.bit.VO.UserInfo" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>测试EL表达式</title>
</head>
<body>
<%-- Sriptlet--%>
<%--<%
    UserInfo userInfo=new UserInfo ();
    userInfo.setUsername ( "arvin" );
    System.out.println ("username="+userInfo.getUsername () );
%>--%>
<%-- 表达式--%>
<%--<<%=userInfo.getUsername()%>--%>
<%-- EL表达式--%>
<h1>测试EL表达式</h1> </br>
<p/>
<li>普通字符串测试</li><br>
strKey:<%=request.getAttribute("strKey")%></br>
str(EL):${requestScope.strKey}</br>
str(EL):${strKey}</br>

</body>
</html>

