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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("PlayerServlet 초기화");
        System.out.println("PlayerServlet doPost 처리됨");
        System.out.println("Player Name: King");
        System.out.println("Player Type: 300");

        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String score = req.getParameter("score");

        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "POST request received in PlayerServlet" + "</h1>");
        out.println("Player Name: " + name + "<br>");
        out.println("Player Score: " + score);
        out.println("</body></html>");
        out.close();


    }
}
