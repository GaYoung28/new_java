<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    // item 가져오기
    String item = request.getParameter("item");
    Cookie[] cookies = request.getCookies(); // 모든 쿠키 가져오기
    boolean exists = false; // 중복 여부 확인 변수

    if (cookies != null) {
        for (Cookie c : cookies) {
            if (c.getName().equals("cart" + item)) { // 쿠키 이름 확인
                exists = true; // 이미 존재하는 아이템임
                break;
            }
        }
    }
    if (!exists) { //아이템 존재하지 않으면 장바구니에 추가
        Cookie c = new Cookie("cart" + item, item);
        response.addCookie(c);
        out.println("<p>아이템 '" + item + "'이 장바구니에 추가되었습니다.</p>");
    } else {
        out.println("<p>아이템 '" + item + "'은 이미 장바구니에 있습니다.</p>");
    }
%>


<hr color="red">
<a href="viewCart.jsp">장바구니 보기</a>


</body>
</html>
