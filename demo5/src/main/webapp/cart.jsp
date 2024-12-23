<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 style="background-color: yellow">추가할 아이템을 입력하세요</h2>
<p>단, 동일한 물건을 장바구니에 넣을 수 없음.</p>
<p>(영문입력 가능, 띄어쓰기 없음)</p>
<a href="viewCart.jsp">장바구니 보기</a>

<form  action="addCart.jsp" method = "post">
  <input type="text" name="item"><br>
  <button type="submit">장바구니 추가</button>
</form>

</body>
</html>
