<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- 웹프로그램은 출력틀이 html이어야함. --%>
<%-- 웹프로그램의 출력용 틀로 j2ee 프로젝트에서는 jsp를 쓰고 있음. --%>
<%-- 템플릿(틀) 엔진(보여지는 틀을 만드는 엔진) : jsp ---> 타임리프(더 간단한) --%>
<%
    //스크립트릿 (scriptlit : 끄적끄적 쓰는 조그마한 프로그램, 조각 프로그램)
    //jsp --- servlet 전환!
    //init() 초기화 --- service() -- doGet, doPost 요청 -- destroy() 종료
    //service() 안으로 다 구현되어서 들어감.
    //여기서 만들어지는 변수는 지역변수(반드시 초기화)
    //1. 브라우저에 있는 쿠키 목록을 가지고 오자. Cookie[] 배열로 가지고옴
    Cookie[] cookies = request.getCookies();

    //2. 배열에서 하나씩 꺼내어 조건에 맞는 것만 쓰자.
    //   키(이름), 값의 쌍으로 되어있음.
    for (Cookie cookie : cookies) {
        //PrintWriter out = response.getWriter(); //jsp는 out 객체가 이미 만들어져있음. 내장객체! java에서는 객체 만들어주고 써야함.
        if (!cookie.getName().equals("JSESSIONID")) { //JSESSIONID 2FF6867236D932ED6017DFC9B652C6C5는 제외하고 출력하고 싶을 때 -> name이 JSESSIONID는 제외하고
            out.println(cookie.getName() + " " + cookie.getValue() + "<br>");
            //System.out.println(cookie.getName() + " " + cookie.getValue());
        }
    }
 %>
</body>
</html>
