package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "game", value = "/game")
public class GameServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("GameServlet 초기화");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //받을 때 한글처리 server.xml 설정에 따라감 -> get 방식은 받을 때 한글처리 안해줘도 됨
        //서버에서 데이터를 받자
        String gameName = req.getParameter("gameName");
        String gameType = req.getParameter("gameType");

        //응답을 보내자 한글로
        //get방식은 요청 처리는 server.xml에서 설정해줬기 때문에 별도로 설정 X,
        //응답을 보낼 때는 body로 보내기 때문에 body마다 인코딩을 설정해주어야함.
        resp.setContentType("text/html;charset=UTF-8");

        //resp.getWriter().println() 대신 객체 생성해서 사용
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "GET request received in GameServlet" + "</h1>");
        out.println("Game Name: " + gameName + "<br>");
        out.println("Game Type: " + gameType);
        out.println("</body></html>");

        out.close();

        System.out.println("GameServlet doGet 처리됨");
        System.out.println("Game Name: " + gameName);
        System.out.println("Game Type: " + gameType);
    }
}
