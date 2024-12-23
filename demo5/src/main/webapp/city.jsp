<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- action은 서버에서 받을 주소 --%>
<%-- method는 생략하면 get방식으로 설정됨. --%>
<%-- 서버에서는 action에서 적은 주소와 method의 방법에 따라 처리할 수 있는 함수를 호출 --%>
<h1><%= "Enter City Information" %>
</h1>
<br/>
<a href = "city2">busan</a>

<hr color="red">

<form  action="city2" method="post">
    City Name: <input name="name" value="ulsan"><br>
    City Population: <input name="population" value="3000"><br>
    <button type="submit">Submit</button>
</form>
</body>
</html>
