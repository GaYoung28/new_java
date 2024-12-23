package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/logout.do")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //세션 끊고. 세션으로 설정한 값 모두 지우자.!!
        //세션 객체 먼저 획득 후, 세션 끊기
        HttpSession session = req.getSession();
        session.invalidate(); //세션 끊기
        //session.removeAttribute("loginId"); //하나만 지우고 싶을 때
        //화면을 loginSession.jsp로 넘기자.
        //클라이언트에게 loginSession.jsp를 호출하라고 명령해서 넘기자.
        //컨트롤러에서 어떤 처리 결과값을 jsp로 보내고자 하는 경우에는 사용 x
        //sendRedirect 는 완전히 새로운 요청을 다시 할 때 사용함..
        resp.sendRedirect("loginSession.jsp");
        //새로운 request/response 객체 생성됨.


    }
}
