
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>쿠키 정보 가지고 오기</h1>
<hr>
<%
  Cookie[] cookies = request.getCookies();
  if(cookies != null){ //쿠키가 없을 수도 있으니까 null이 아니면 꺼내오는걸로
      for (Cookie c : cookies) {
          if(!c.getName().equals("JSESSIONID")){
              out.println(c.getName() + ": " + c.getValue() + "<br>");
          }
          if(c.getName().equals("adTracker")){
              out.println("광고를 클릭하셨군요.!!!");
              out.println("고객님의 정보는 " + c.getValue() + "님입니다.");
          }
      }
  }
%>
</body>
</html>
