<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  String check = (String) session.getAttribute("check");

  if (check != null){ //세션 설정됨.
    out.println("현재 체크상태는 " + check  + "입니다.");
  } else{ //세션 설정안됨.
    out.println("check <input type='checkbox'>");
  }
%>

</body>
</html>
