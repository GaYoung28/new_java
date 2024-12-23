<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>장바구니</h1>
<%
    Cookie[] cookies = request.getCookies();
    String cart = "";
    if (cookies != null) {
        for (Cookie c : cookies) {
            if (c.getName().contains("cart")) {
                cart = c.getValue();
                out.println(cart);
            }
        }
    }else {
        out.println("장바구니가 비어 있습니다.");
    }
%>
<a href="cart.jsp">아이템 추가</a>

</body>
</html>
