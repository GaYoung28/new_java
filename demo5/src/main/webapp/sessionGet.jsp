<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  //세션을 가지고 와보자.
  //로그인 성공이면 loginId를 세션에 저장할 예정.
  //로그인 했을 때 화면과 로그인 안했을 때 화면이 다르다.
  //--> 어떻게 판단? --> 세션에 저장된 loginId가 있는지 없는지로 판단함.
  String loginId = (String) session.getAttribute("loginId"); //session은 값이 아무 형태나 다 됨 = Object로 저장됨
  //꺼내올 때는 원하는 타입으로 변형해서 꺼내야한다. String으로 --> (강제형변환)

  //출력해보자.
  if (loginId == null){ //로그인이 안되어있다라고 판단.
    out.println("로그인 되어있지 않음. ");
  } else{ //로그인이 되었다라고 판단.
    out.println("로그인 되어있음. 아이디는 " + loginId );
    out.println("<a href='logout.do'>로그아웃</a>");
  }
%>
</body>
</html>
