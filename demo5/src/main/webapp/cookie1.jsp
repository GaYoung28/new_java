<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--쿠키는 서버에서 클라이언트인 브라우저에 보내는 문자 정보--%>
<%--response 객체를 활용함. 자바의 객체, 자바가 필요 !! <%를 사용해서 쓸 수 있음 --%>
<%
  //자바가 들어가는 부분.. html안에 자바를 껴넣음
  //스크립트릿 (스크립트 lit(조금쓰는 부분))
  //1. 쿠키객체 만들기(키, 값의 쌍으로 만든다.)
  Cookie cookie = new Cookie("name","hong"); //cookie는 값 string으로만 사용 가능

  //2. 쿠키의 유효기간 + 도메인별 설정 등
  cookie.setMaxAge(1000);//1000: 1초 뒤에 없어져라 , 10000: 10 초 뒤에 없어져라
  //한번 심었는데 쿠키를 지우고 싶으면 setMaxAge를 0으로 하면 쿠키 삭제됨.
  //cookie.setMaxAge(0);

  //3. 쿠키를 브라우저에 전송
  //하나의 요청 당 request, response 객체가 톰킷의 서블릿엔진에 의해 생성됨.
  response.addCookie(cookie);
%>
</body>
</html>
