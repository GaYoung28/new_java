<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>해당 페이지는 광고를 포함하고 있습니다.</h1>
<%
    Cookie c1 = new Cookie("adTracker", "user12345");
    Cookie c2 = new Cookie("adCompany", "shinsegae");
    Cookie c3 = new Cookie("count", "5");
    Cookie c4 = new Cookie("pay", "ok");
    c1.setMaxAge(60 * 10); //유효시간 10분 (초단위)
    response.addCookie(c1);
    response.addCookie(c2);
    response.addCookie(c3);
    response.addCookie(c4);
%>
<h1>광고 페이지를 클릭하셨습니다.</h1>
</body>

</html>
