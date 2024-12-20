<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function btnClick(){
            //입력한 값을 가지고 와서
            let gameName = document.getElementById("gameName").value;
            let gameType = document.getElementById("gameType").value;

            //입력하지 않았으면 보내지 말자!!
            if(gameName.length > 0 && gameType.length > 0) {
                //get방식으로 url로 보내자.!!
                //http://localhost:8888/game?gameName=스마일게임&gameType=멀티롤
                location.href = "game?gameName=" + gameName + "&gameType=" + gameType;
            }else{
                alert("입력이 완료되지 않았음. 입력을 해주세요.");
            }
        }
    </script>
</head>
<body>
<%-- action은 서버에서 받을 주소 --%>
<%-- method는 생략하면 get방식으로 설정됨. --%>
<%-- 서버에서는 action에서 적은 주소와 method의 방법에 따라 처리할 수 있는 함수를 호출 --%>
<h1><%= "Game Form" %></h1>
<br/>
<h1><%= "자바 스크립트로 GET 요청" %>
</h1>

gameName: <input type="text" id="gameName" value="스마일게임"><br>
gameType: <input type="text" id="gameType" value="멀티롤"><br>
<button onclick="btnClick()" type="button">자바 스크립트로 GET 요청</button>

<%--<form  action="game" method="get">--%>
<%--    gameName: <input name="name" value="smile game"><br>--%>
<%--    gameType: <input name="type" value="multirole"><br>--%>
<%--    <button type="submit">자바 스크립트로 GET 요청</button>--%>
<%--</form>--%>

<hr color="blue">

<form  action="player" method="post">
    Player Name: <input name="name" value="킹"><br>
    Player Score: <input name="score" value="300"><br>
    <button type="submit">폼으로 POST요청</button>
</form>

</body>
</html>
