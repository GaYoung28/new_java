
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  String item = request.getParameter("item");
  Cookie c = new Cookie("name" + item, item);
  response.addCookie(c);
  out.println("아이템 '"+ item + "'이 장바구니에 추가되었습니다.");
%>
<hr color="red">
<a href="viewCart.jsp">장바구니 보기</a>


</body>
</html>
