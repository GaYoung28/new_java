package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "player", value = "/player")
public class PlayerServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("PlayerServlet 초기화");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Post 방식은 요청 데이터가 body에 담기므로
        // 받을 때마다 한글로 인코딩을 해주어야함.
        //파라메터 값을 추출하기 전에 한글 인코딩을 설정해주어야함
        req.setCharacterEncoding("UTF-8"); //파라메터를 받기 전에 UTF-8로 인코딩
        String name = req.getParameter("name");
        String score = req.getParameter("score");

        //응답을 보내자 한글로
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "POST request received in PlayerServlet" + "</h1>");
        out.println("Player Name: " + name + "<br>");
        out.println("Player Score: " + score);
        out.println("</body></html>");
        out.close();

        System.out.println("PlayerServlet doPost 처리됨");
        System.out.println("Player Name: " + name);
        System.out.println("Player Type: " + score);
    }
}
