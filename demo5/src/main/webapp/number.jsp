<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--form 안의 button type은 생략하면 submit , form안에서는 항상 버튼 타입이 submit임.--%>
<form  action="number">
    숫자 1: <input name="num1" value="100"><br>
    숫자 2: <input name="num2" value="200"><br>
    <button type="submit">합하기</button>
</form>
</body>
</html>
