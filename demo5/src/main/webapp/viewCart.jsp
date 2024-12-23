
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>장바구니</h1>
<%
  Cookie[] cookies = request.getCookies();
  for(Cookie c : cookies){
    if (c != null) {
    out.println(c.getValue());
  }
%>
<a href="cart.jsp">아이템 추가</a>

</body>
</html>
