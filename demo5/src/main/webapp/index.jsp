<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<a href="hello-servlet2">Hello Servlet2</a>
<!-- a태그는 get 요청 -->
<a href="controller">controller 호출</a>
<hr>
<!-- post 요청은 form 태그 이용 -->
<!--http://localhost:8888/Gradle___org_example___demo5_1_0_SNAPSHOT_war/controller -->
<form action="controller" method="post">
    id 입력: <input name="user" value="root"><br>
    <button type = "submit"> 서버로 id전송</button>
</form>
<hr>
<form  action="controller" method="get">
    id입력: <input name="user" value="root"><br>
    <button type="submit">서버로 id전송</button>
</form>
<!-- get 요청 -->
<!--http://localhost:8888/Gradle___org_example___demo5_1_0_SNAPSHOT_war/controller?user=root -->
<!-- action은 주소를 넣음 / get은 생략 가능 / form에서 전달할 때 button type은 submit으로 해줘야함-->
<form action="member" method="get">
    id: <input name="id" value="root"><br>
    pw: <input name="pw" value="1234"><br>
    name: <input name="name" value="park"><br>
    tel: <input name="tel" value="011"><br>
    <button type = "submit"> 서버로 전송</button>
</form>
</form>
</body>
</html>